/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fatma.firstapp.backend;

/**
 *
 * @author fatma
 */


public class NumberEngin {
    
    
     public  void swapVariables(int number1, int number2) {
        int cup = number1;
        number1 = number2;
        number2 = cup;
        System.out.print(number1 + " ");
        System.out.println(number2);
    }

    public  void calcoulateSumOfDigitsSquer(int number) {
//         Scanner scan = new Scanner(System.in);
//        System.out.print("Enter any Integer number : ");
//        int number = scan.nextInt();
        int stepCount = 0;
        int newNumber = 0;
        int digitsSum = 0;
        int remind = 0;

        while (true) {
            while (number > 0) {
                remind = number % 10;
                newNumber += (remind * remind);
                number /= 10;
            }
            if (newNumber == 1 || newNumber == 4 || newNumber == 16 || newNumber == 37 || newNumber == 42 || newNumber == 58 || newNumber == 89 | newNumber == 145) {
                System.out.println(stepCount);
                break;
            } else {
                stepCount = stepCount + 1;
                System.out.println(newNumber);
                number = newNumber;
                newNumber = 0;
            }
        }
    }

    public  int calculateMonthDays(int month, int year)throws Exception {

        int daysCount = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (year % 4 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
               return 30;
               
            default:
                throw new Exception();
        }
    }

    public  int[] calculateDigitsSum(int number) {

        int digitsCount = 0;
        int reminder = 0;
        int digitsSum = 0;
        int newNumber = 0;
        int[] message = new int[3];
        do {
            reminder = number % 10;
            digitsSum += reminder;
            newNumber = digitsSum + (reminder * reminder);
            number /= 10;
//            System.out.println(reminder);
            digitsCount = digitsCount + 1;
        } while (number != 0);
        message[0] = digitsCount;
        message[1] = digitsSum;
        message[2] = newNumber;
        return message;
    }

    public  int calculateBerma() {
//        int number;
//    for(int i=0;;i++){
//        if(i%2==1&&i%3==1&&i%4==1&&i%5==1&&i%6==1&&i%7==0){
//            number=i;
//            break;
//        }
//    }
//        System.out.println(number);
//        
//int i=7;
//    for(;!(i%2==1&&i%3==1&&i%4==1&&i%5==1&&i%6==1&&i%7==0);i+=7){
//    }
//        System.out.println(i);
        int num = 60;
        for (;; num += 60) {
            if ((num + 1) % 7 == 0) {
                System.out.println(num + 1);
                break;
            }
        }
        return num;
//    for(int r=60;;r=r+7){
//        if(r%2==1&&r%3==1&&r%4==1&&r%5==1&&r%6==1&&r%7==0){
//            System.out.println(r);
//        }
//    }
    }

    public  void test() {
        int firstNumber;//Declaration
        firstNumber = 20;//Assignment
        int secoundNumber = 15;//Initialization
        int sum;
        sum = firstNumber + secoundNumber;
        int diff = firstNumber - secoundNumber;
        int mul;
        mul = firstNumber * secoundNumber;

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        float dev = (float) firstNumber / secoundNumber;
        System.out.println(dev);
    }

    public  String calculateAngleBetweenArmClock(int hour, int minute) {

        //Input
        float angle = 0;
        float hourAngle;
        float minuteAngle;

        //processing
        if (hour > 12) {
            hour = 24 - hour;
        }
        if ((hour >= 0 && hour <= 12) && (minute >= 0 && minute <= 59)) {
            hourAngle = hour * 30 + minute * 0.5f;
            minuteAngle = (float) (minute * 6);
            angle = minuteAngle - hourAngle;
            if (angle < 0) {
                angle *= -1;
            }
        }

        //outputString message="";
        String message = "";
        if (hour > 12) {
            message = "Error : Hours can`t be greater then 12";
//            System.out.println("Error : Hours can`t be greater then 12");
        } else if (hour < 0) {
            message = "Error : Hours can`t be smaller than 0";
//            System.out.println("Error : Hours can`t be smaller than 0");
        } else if (minute > 59) {
            message = "Error : Hours can`t be greater than 59";
//            System.out.println("Error : Hours can`t be greater than 59");
        } else if (minute < 0) {
            message = "Error : Hours can`t be smaller than 0";
//            System.out.println("Error : Hours can`t be smaller than 0");
        } else {
            message = "Angle is " + angle;
//        System.out.println("Angle is " + angle);
        }
        return message;
    }
}
