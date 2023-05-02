package com.sparta.ss;


public class FilmClassifications {

   /* public static void main(String[] args) {
        int ageOfViewer = 1;
        System.out.println(getAgeOfViewer(ageOfViewer));
    }*/


    public static String getAgeOfViewer(int ageOfViewer) {
        String result = "";
        if (ageOfViewer > 0 && ageOfViewer<15) {
            result = "U, PG & 12 films are available.";
        } else if (ageOfViewer >= 15 && ageOfViewer < 18) {
            result = "U, PG, 12 & 15 films are available.";
        }  else{
            result = "All films are available.";
        }
        return result;
    }
}
