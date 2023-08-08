package javacore;

import java.util.Scanner;

public class test7 {

    public static void main(String[] args) {
//        Write a program that takes an integer input (1 to 7) representing a day of the week and prints the corresponding day's name (e.g., 1 - Sunday, 2 - Monday, etc.). ( Note: use switch case )

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch(a)
        {
            case 1 : System.out.println("Sunday");  break;
            case 2:  System.out.println("monday"); break;
            case 3:  System.out.println("tuesday");  break;
            case 4:  System.out.println("wednesday");break;
            case 5:  System.out.println("thursday");break;
            case 6:  System.out.println("friday");break;
            case 7 : System.out.println("saturday");break;
            default: System.out.println("case not found");




        }

    }
}
