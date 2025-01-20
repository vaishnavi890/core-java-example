package com.vaishnavi.practice.enums;

public class WeekDaysDemo {
   public enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
    public static void main(String[] args){

        for (Day d : Day.values())
            System.out.println(d);

       // Day day=Day.MONDAY;

        //switch(day){
          //  case SUNDAY:
            //    System.out.println("sunday");
              //  break;
            //case MONDAY:
              //  System.out.println("monday");
               // break;
          //  default:
            //    System.out.println("other day");
        }
    }

