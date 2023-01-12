package day03ifstatement;

import java.util.Scanner;

public class Practise4 {
    public static void main(String[] args) {

        /*
        Example 7: Type a program which converts the mile to kilometer. Mile value will be entered by user.(Use double)
                    Hint 1: km = mile x 1.6
                    Hint 2: To get double, use nextDouble()
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the mile please");
        double m = input.nextDouble();
        System.out.println(m + " mile" + " = " + m * 1.6 + " km");

        /*
        Example 8: Type a program which converts the hours to seconds. Hours value will be entered by user.(Use long)
                    Hint 1: second = hour x 60 x 60
                    Hint 2: To get long, use nextLong()
        */
        System.out.println("Enter the hour please");
        long h = input.nextLong();
        System.out.println(h + " hours " + h * 60 * 60 + " seconds");
    }
}
