package com.wip.automation.excercise8;

public class SubstractOperator implements Operator {
  public int execute(int a, int b) {
    return a - b;
  }

  public String toString() {
    return "Substract operator ";
  }
}
