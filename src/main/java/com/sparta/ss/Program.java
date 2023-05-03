package com.sparta.ss;

import java.util.Arrays;
import java.util.Scanner;

import static com.sparta.ss.PalindromeChecker1.isPalindrome;

public class Program {
    public static void main(String[] args) {

        // Greeting
        int timeOfDay = 21;
        System.out.println(getGreeting(timeOfDay));


        // Check if a word is palindrome
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

      // String cleanedString = inputString.toLowerCase().replaceAll("[^a-z]", "");


        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }

        //Palindrome Checker for longest word in a sentence
        String[] sentence = {"racecar", "madam", "hello", "level", "world", "radar","malayalam"};
        String longestPalindrome = PalindromeChecker2.findLongestPalindrome(sentence);
        System.out.println("Longest palindrome in the sentence is: " + longestPalindrome);


        //Bubble Sort Output
        int[] arr = {14,15,4,5,6,8};
        System.out.println("Original array: " + Arrays.toString(arr));
        BubbleSort.bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
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
