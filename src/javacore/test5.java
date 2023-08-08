package javacore;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {

//        Write a program that takes an integer input from the user and prints whether it is positive, negative, or zero.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a==0)
        {
            System.out.println(a + "is zero");
        }
        else if(a>0)
        {
            System.out.println(a + "is positive");
        }
        else {

            System.out.println(a + "is negative");
        }
    }
}
