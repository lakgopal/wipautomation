package com.wip.automation.excercise2;

public class LoopsExp {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
  //post increment
    int a=5;
    System.out.println("The value of a is" + a++);
    
    //pre increment
    
    int b= 5;
    System.out.println("The value of b is" + ++b);
    
    //Find value of (x+y)(x+y) 
    
    int x= 15;
    int y= 10;
    int z= x+y;
    System.out.println("The value of (x+y) (x+y) is" + z*z);
    
    //Find x%y;
    int mod= x%y;
    System.out.println("The mod is" + mod);
    
    //Find 2x + y
    int res=2*x+y;
    System.out.println("The result of 2x+y is" + res);
    
    //Find the sum of first N natural number ( 1- 100)
    int i=1;
    int s=0;
    
    for(i=1; i<100;i++)
    {
        s= s+i;
        System.out.println("The sum of first N numbers are" +s);
       
    }
            
    //Find the sum of even numbers in N natural numbers
    int sum=0;
    for(i=0;i<20;i++)
    {
     if(i%2==0)
        {
            sum=sum+i;
             System.out.println("The sum of even numbers in N numbers are" +sum);
        }
    
    }
    
    
    //Print 2 table using while loops.
    
    
    int k=1;
    while(k<10)
    {
        int mul=0;
        mul=2*k;
        k++;
        System.out.println("The multiplication 2 table:" +mul);
        
    }
            

  }

}
