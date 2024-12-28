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
public class ArrayEngine {
     int calculateSumOfArrayElement(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

     int[] findMaxAndMinElement(int[] number) {
        int result[] = new int[2];
        result[0] = number[0];
        result[1] = number[0];
        for (int i = 1; i < number.length; i++) {
            if (result[0] > number[i]) {
                result[0] = number[i];
            }
            if (result[1] < number[i]) {
                result[1] = number[i];
            }
        }
        return result;
    }

     int countRepetedNumber(int[] numbers, int target) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }
        return count;
    }

     int countEvenNumbers(int[] numbers){
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    
     int[] reverseArray(int[] numbers){
        int[] reverse=new int[numbers.length];
        for(int i=0 , t=numbers.length-1;i<numbers.length;i++, t--){
            reverse[i]=numbers[t];
        }
        return reverse;
    }
    
     int getTargetIndex(int[]numbers,int target){
        int index=-1;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==target){
                return i;
              
            }
        }
        return -1;
    }
    
     boolean isFound(int[]numbers,int target){
     
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==target){
                return true;
                
            }
        }
        return false;
    }
    
     int[] getDistincitValues(int[] numbers){
        int[] distinctArray=new int[numbers.length];
        int index=0;
        int count0=0;
        for(int i=0 , t=0; i<numbers.length;i++,t++){
//            if(numbers[i]==0&&count0==0){
//                index++;
//                count0++;
//            }
//           else if(!isFound(distinctArray, numbers[i])){
//                distinctArray[index]=numbers[i];
//                index++;
//            }

             int targetIndex=getTargetIndex(distinctArray, numbers[i]);
             if(targetIndex==-1||targetIndex==index){
                 distinctArray[index]=numbers[i];
                index++;
             }
           
        }
        int[] trimmedArray=sliceArray(distinctArray,index);
        return trimmedArray;      
       
    }
    
     int[] sliceArray(int[]numbers, int newSize){
         int[] trimmedArray=new int[newSize];
        for (int i = 0; i < trimmedArray.length; i++) {
             trimmedArray[i]=numbers[i];
            
        }
        return trimmedArray;
    }
}
