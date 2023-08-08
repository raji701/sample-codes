package javacore;

import java.util.Scanner;

enum DayOfWeek
{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
public class test10 {

    public static void main(String[] args) {
//        Create an enum for the days of the week and write a program that takes a day's name (e.g., "MONDAY", "TUESDAY") as input and prints the next day using switch statements. ( Note: use switch case )

       // DayOfWeek week = DayOfWeek.MONDAY;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a week");
        String week = sc.nextLine().toUpperCase();

        DayOfWeek currentDay ;

        try {
            currentDay = DayOfWeek.valueOf(week);
        } catch (IllegalArgumentException ex) {
            System.out.println("Invalid day's name. Please enter a valid day.");
            return;
        }

        DayOfWeek w = switch(currentDay)
        {
            case MONDAY-> w= DayOfWeek.TUESDAY ;
            case TUESDAY -> w= DayOfWeek.WEDNESDAY;
            case WEDNESDAY -> DayOfWeek.THURSDAY;
            case THURSDAY -> DayOfWeek.FRIDAY;
            case FRIDAY -> DayOfWeek.SATURDAY;
            case SATURDAY -> DayOfWeek.SUNDAY;
            case SUNDAY -> DayOfWeek.MONDAY;

        };

    }
}
