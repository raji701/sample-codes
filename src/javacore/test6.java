package javacore;

import java.util.Scanner;

public class test6 {

    public static void main(String[] args) {

//        Create a number guessing game where the program generates a random number, and the player has to guess it. Provide hints like "too high" or "too low" after each guess, and count the number of attempts.


        Scanner sc = new Scanner(System.in);

        int random = (int)(Math.random()*10);
        int count =0 ;

        while(true) {

            System.out.println(" guess a number between 1 to 10");
            int input = sc.nextInt();



            count++;

            if (input == random) {
                System.out.println("your guess is correct");
                break;

            } else if (input > random) {
                System.out.println("your guess is too high");

            } else {
                System.out.println("your guess is too low");

            }
        }

        System.out.println("your number of attempts" +count);
    }
}
