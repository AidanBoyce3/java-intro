package com.aidanboyce;

import com.aidanboyce.model.Person;

public class Main {

    public static void main(String[] args) {
        String name = "hotdog";
        int year = 2006;
        String phrase = new Person().speak();

        System.out.println(phrase);
        System.out.println(name);
        System.out.println(year);
    }

}
