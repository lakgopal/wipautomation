package com.wip.automation.excercise5;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Calculator cal = new Calculator();
    int sum = cal.add(10, 5);
    int mod = cal.modulas(20, 4);
    int sub = cal.substract(10, 5);
    int mul = cal.multiply(5, 2);
    int div = cal.division(15, 3);
    int square = cal.square(5);
    

    System.out.println("The sum of two numbers are:" + sum);
    System.out.println("The Modulas of two numbers are:" + mod);
    System.out.println("The Difference of two numbers are:" + sub);
    System.out.println("The product of two numbers are:" + mul);
    System.out.println("Division of two numbers are:" + div);
    System.out.println("The square of num is:" + square);
  }

}
