package com.wip.automation.excercise6;

import java.util.Date;

public class Movie {
  String title;
  String genre;
  Date releasedate;
  int movielength;

  public Movie(String t, String g, Date r, int m) {
    title = t;
    genre = g;
    releasedate = r;
    movielength = m;
  }

  public String getTitle() {
    return title;
  }

  public String getGenre() {
    return genre;
  }

  public Date getReleasedate() {
    return releasedate;
  }

  public int getMovielength() {
    return movielength;
  }

  public void printdetails() {
    System.out.println("Title of movie is:" + getTitle());
    System.out.println("Genre of movie is:" + getGenre());
    System.out.println("Release dateof movie is:" + getReleasedate());
    System.out.println("Length of movie is:" + getMovielength());
  }



}
