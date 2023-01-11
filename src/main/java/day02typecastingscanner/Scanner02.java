package day02typecastingscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Example 1: Get the width and the length of a rectengle from user and calculate the area of the rectangle
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the Width");
        double width=input.nextDouble();

        System.out.println("Enter the Length");
        double length=input.nextDouble();

        System.out.println("The Area Is: "+width*length);


    }
}
