/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fatma.firstapp.backend;

import java.util.Scanner;
import net.seniorsteps.firstapp.package2.geometry.Circle;
import net.seniorsteps.firstapp.package2.geometry.GeometryEngin;
import net.seniorsteps.firstapp.package2.geometry.NagativeException;
import net.seniorsteps.firstapp.package2.geometry.Rectangle;
import net.seniorsteps.firstapp.package2.geometry.Squere;

/**
 *
 * @author fatma
 */
public class FirstApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Rectangle rect=new Rectangle();
        rect.setHeight(20);
        rect.setWidth(10);
        GeometryEngin geometry=new GeometryEngin();
        float area= geometry.calculateRectangleArea(rect);
        System.out.println("Area : "+area);
        
        Circle circle=new Circle(-5);
        circle.setDistance(6);
        float primeter=geometry.calculateCirclePerimeter(circle);
        System.out.println("Primeter : "+primeter);
        
        Squere square=new Squere();
        square.setSide(8);
        float perimeter=geometry.calculateSquarePerimeter(square);
        System.out.println("Square Primeter : "+perimeter);
         
        }catch(NagativeException nagative){
            System.err.println(nagative.getMessage());
        }
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
//        System.out.print("The Output Of Sum Of Digits Squer : ");
//        calcoulateSumOfDigitsSquer(78);
//        System.out.println("The Output Of Month Days : "+calculateMonthDays(11,2003));
//          int[] digitsResult=calculateDigitsSum(657433);
//        System.out.println("The Output Of Digits count : "+digitsResult[0]+" Digits Sum : " +digitsResult[1]+" Square digits "+digitsResult[2]);
//        System.out.println("The Output Of Berma : "+calculateBerma());
//        System.out.println("The Output Of Angle Between Arm Clock : "+calculateAngleBetweenArmClock(7,58));
//        Scanner scan=new Scanner(System.in);
//        int num1=scan.nextInt();
//        int num2=scan.nextInt();
//        swapVariables(num1,num2);

//        int[] numbers = {12, 23, 34, 45, 56, 67, 78, 89, 90, 267};
//        int[] input = {1,2,5,3,9,0,5};
//        System.out.println(calculateSumOfArrayElement(numbers));
//        int[] result = findMaxAndMinElement(numbers);
//        System.out.println("The Max Number : " + result[0] + " \nThe Min Number : " + result[1]);
//        int number =- 15;
//        int count = countRepetedNumber(numbers, number);
//        System.out.println("The Count Of Repeated Number " + number + " in array " + " is " + count);
//        int evenCount = countEvenNumbers(numbers);
//        System.out.println("Count Of Even Number : " + evenCount);
//        int[]reversedArray=reverseArray(numbers);
//        for(int i=0; i<reversedArray.length;i++){
//            System.out.println(reversedArray[i]+"\t");
//        }
//        
//        System.out.println(getTargetIndex(numbers, 34));
//        System.out.println(isFound(numbers, 4));
//
//        int[]getDistincitValues=getDistincitValues(input);
//        for(int i=0; i<getDistincitValues.length;i++){
//           
//            System.out.print(getDistincitValues[i]+"\t");
//        }
    }

}
