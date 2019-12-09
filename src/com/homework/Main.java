package com.homework;

public class Main {

    public static void main(String[] args)  {
        String str = "|/-\\|/-\\";
        String output = "";
        char l;
        for (; ;) {
            for (int i = 0; i < str.length(); i++) {
                l = str.charAt(i);
                System.out.println(l);
                //With animation effect uncomment the line below
                //System.out.print("\r" + l);

            }
        }
    }
}

