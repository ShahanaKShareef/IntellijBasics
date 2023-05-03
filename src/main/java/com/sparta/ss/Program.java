package com.sparta.ss;

import java.util.Scanner;

import static com.sparta.ss.PalindromeChecker1.isPalindrome;

public class Program {
    public static void main(String[] args) {
        int timeOfDay = 21;
        System.out.println(getGreeting(timeOfDay));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();



        // Convert the input string to lowercase and remove all non-letter characters
     //   String cleanedString = inputString.toLowerCase().replaceAll("[^a-z]", "");

        // Check if the cleaned string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
        String[] sentence = {"racecar", "madam", "hello", "level", "world", "radar","malayalam"};
        String longestPalindrome = PalindromeChecker2.findLongestPalindrome(sentence);
        System.out.println("Longest palindrome in the sentence: " + longestPalindrome);
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
