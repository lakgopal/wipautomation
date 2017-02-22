package com.wip.automation.excercise6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class MoviesMain {

  public static void main(String[] args) throws ParseException {
    // TODO Auto-generated method stub


    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    java.util.Date rd1 = sdf.parse("1992-07-26");
    java.util.Date rd2 = sdf.parse("1996-07-24");
    java.util.Date rd3 = sdf.parse("2002-08-12");
    java.util.Date rd4 = sdf.parse("2013-06-15");
    java.util.Date rd5 = sdf.parse("2016-03-20");

    Movie[] movies = new Movie[5];
    movies[0] = new Movie("Movie1", "Action", rd1, 75);
    movies[1] = new Movie("Movie2", "Drama", rd2, 150);
    movies[2] = new Movie("Movie3", "Action", rd3, 100);
    movies[3] = new Movie("Movie4", "Action", rd4, 200);
    movies[4] = new Movie("Movie5", "Comedy", rd5, 110);

    System.out.println("**Printing movies**");
    for (int i = 0; i < movies.length; i++) {
      movies[i].printdetails();
    }



  }
}


