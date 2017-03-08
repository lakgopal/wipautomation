package com.wip.automation.excercise8;

public class MultiplyOperator implements Operator {
  public int execute(int a, int b) {
    return a * b;
  }

  public String toString() {
    return "Multiply operator ";
  }
}
