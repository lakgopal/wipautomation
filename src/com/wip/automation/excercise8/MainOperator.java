package com.wip.automation.excercise8;

public class MainOperator {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int a = 200;
    int b = 100;
    Operator add = new AddOperator();
    System.out.println("Addition of two numbers:" + add.execute(a, b));
    System.out.println("Tostring method returns:" + add.toString());
    Operator sub = new SubstractOperator();
    System.out.println("Substraction of two numbers are:" + sub.execute(a, b));
    System.out.println("Tostring method returns:" + sub.toString());
    Operator mul = new MultiplyOperator();
    System.out.println("Multiplication of two numbers are:" + mul.execute(a, b));
    System.out.println("Tostring method returns:" + mul.toString());
    Operator div = new DivideOperator();
    System.out.println("Division of two numbers are:" + div.execute(a, b));
    System.out.println("Tostring method returns:" + div.toString());
  }

}
