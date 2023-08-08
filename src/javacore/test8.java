package javacore;
import java.util.Scanner;
public class test8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month (1 to 12): ");
        int month = sc.nextInt();
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn/Fall";
                break;
            default:
                season = "Invalid month";
        }

        System.out.println("The corresponding season for month " + month + " is " + season);
    }
    }

