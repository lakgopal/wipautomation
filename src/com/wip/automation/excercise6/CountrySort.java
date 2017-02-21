package com.wip.automation.excercise6;

import java.util.Arrays;

public class CountrySort {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String[] countries = {"USA", "France", "Australia", "Newzealand", "India"};
    System.out.println("*******Array in sorted order********");
    Arrays.sort(countries);
    for (String str : countries) {
      System.out.println(str);
    }
  }

}
