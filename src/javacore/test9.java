package javacore;

import java.util.Scanner;

public class test9 {

    public static void main(String[] args) {

//        Write a program that takes a month number (1 to 12) and a year as input and prints the number of days in that month using a switch statement. ( Note: use switch case )

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month (1 to 12): ");
        int month = sc.nextInt();
        System.out.print("Enter an year: ");
        int year = sc.nextInt();

      int months =  switch(month)
        {
            case 1,3,5,7,8,10,12 -> 31 ;
            case 4,6,9,11 -> 30;
            case 2-> {
                if(year%4==0||year%100!=0 && year%400==0)
                {
                    yield 29;
                } else
                {
                    yield 28;
                }
                }
            default -> 0;
        };




    }
}
