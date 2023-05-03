package com.sparta.ss;

public class Program {
    public static void main(String[] args) {
        int timeOfDay = 21;
        System.out.println(getGreeting(timeOfDay));

    }

    public static String getGreeting(int timeOfDay) {
        String  greeting="";
        if (timeOfDay >= 0 && timeOfDay < 12) {
            greeting = "Good morning!";
        } else if (timeOfDay==24) {
            greeting = "Good morning!";
        }
        else if (timeOfDay >= 12 && timeOfDay < 18) {
            greeting = "Good afternoon!";
        } else if (timeOfDay >= 18 && timeOfDay < 24){
            greeting = "Good evening!";
        }  else{
            greeting = "Please enter a valid time!";
        }
        return greeting;
    }
}
