package com.wip.automation.excercise3;

import java.util.Scanner;

public class CoreJava {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    //Declare two integers and swap its values 
     int num1 = 5; 
     int num2 = 10; 
     int temp=num1;
     num1=num2;
     num2=temp;
     System.out.println("The value of num1 is:" +num1);
     System.out.println("The value of num2 is:" +num2);
     
     
     //join first numbers with comma
     
     System.out.println("Joining the numbers with comma:");
     for (int i = 1; i <= 100; i++) {
       if(i<100){
      System.out.print(i+"," );
       }
      else{
        System.out.print(i+".");
      }
     }
     
      //Convert given number of days into years months days
     System.out.println("\n Converting days into year,month,days");
       int day,month,year;
       day=580;
       year=day/365;
       int remainder=day%365;
       month=remainder/30;
       day=remainder%30;
       System.out.println("Total number of days are:" +year +"year," +month +"month," +day +"days");
       
       // prints all the digits and sum of the digits
       Scanner s = new Scanner(System.in);
       System.out.print("Enter the number:");
       int num=s.nextInt();
       int sum=0;
       while(num!=0){
         int digit=num%10;
         num=num/10;
         System.out.println("The digits are:" +digit);
         sum=sum+digit;
       }
         System.out.println("The sum of digits are:" +sum);
       // Print triangle with stars for a given number
         System.out.println("STAR PRINT");
         int n = 5;

         for (int i = n; i > 0; i--) {
             {
                 for (int j = i; j >= 1; j--)
                     System.out.print("*");
             }
             System.out.print("\n");
         }
     }

  }


