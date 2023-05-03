package com.sparta.ss;

public class Spartan {
    private static int id =5;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Spartan.id = id;
    }

    public static void main(String[] args) {
        Spartan spartan1 = new Spartan();
        Spartan spartan2 = new Spartan();
        System.out.println(spartan1.getId());
        spartan1.setId(10);
        System.out.println(spartan2.getId());

    }
}
