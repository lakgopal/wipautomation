package com.wip.automation.excercise4;

import java.util.Arrays;

public class ArrayFunction {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int numbers[] = new int[]{16, 13, 85, 2, 19, 120};
    int max=getMax(numbers);
    System.out.println("The Maximum value in array is:" +max);
    int min=getMin(numbers);
    System.out.println("The Minimum value in array is:" +min );
    int SumOfArray=ArraySum(numbers);
    System.out.println("The sum of Array is:" +SumOfArray);
    int[] CopyOfArray=ArrayCopy(numbers);
    System.out.println("The new array is:"  +Arrays.toString(CopyOfArray));
    int[] RevCopyOfArray=RevCopyArray(numbers);
    System.out.println("The reverse copy of Array is" +Arrays.toString(RevCopyOfArray));
  }
  
//Method for getting the maximum value
 public static int getMax(int[] inputArray){ 
   int maxValue = inputArray[0]; 
   for(int i=1;i < inputArray.length;i++){ 
     if(inputArray[i] > maxValue){ 
        maxValue = inputArray[i]; 
     } 
   } 
   return maxValue; 
 }
 
 //Method for getting the minimum value
 
 public static int getMin(int[] inputArray){
   int minValue = inputArray[0];
   for(int i=1; i<inputArray.length;i++){
     if(inputArray[i] < minValue){
       minValue=inputArray[i];
     }
    }
   return minValue;
 }
 
   //Method to find the sum of an array
   public static int ArraySum(int[] inputArray){
     int sum=0;
     for(int i=0;i<inputArray.length;i++){
       sum=sum+inputArray[i];
     }
     return sum;
    }
   
   // Method to copy to new array
   public static int[] ArrayCopy(int[] inputArray){
     int[] copy=new int[inputArray.length];
     for (int i=0;i<inputArray.length;i++){
       copy[i]=inputArray[i];
     }
     return copy;
   }   
     //Method to reverse Array copy

     public static int[] RevCopyArray(int[] inputArray) {
     int[] RevCopyArray = new int[inputArray.length];
     for (int i=0; i<RevCopyArray.length;i++) {
     RevCopyArray[i] = inputArray[inputArray.length-1-i];
        
     }
      return RevCopyArray;
     
   }
  
}


