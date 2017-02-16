package com.wip.automation.excercise5;

public class Circle {
  double PI = 3.14159;
  public static int ctr = 0;
  int radius;

  public Circle(int rad) {
    radius = rad;
    ctr++;
  }

  public double area() {
    return PI * radius * radius;
  }

  public double perimeter() {
    return 2 * PI * radius;
  }


}
