package com.wip.automation.excercise8;

public class AddOperator implements Operator {
  public int execute(int a, int b) {
    return a + b;
  }

  public String toString() {
    return "Add operator ";
  }
}
