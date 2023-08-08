package javacore;

import java.util.Scanner;

public class Test2 {

//    Write a Java program to convert a given String containing numeric characters into an integer and a double.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a numeric character string");
        String str = sc.nextLine();

         int a =Integer.valueOf(str);
        System.out.println(a);


    }
}
