package day02typecastingscanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Scanner Class:We will get data from user into our codes

        //How to get data from user ?

        //1.Step: Create an "object" from "Scanner Class"
        //Class name        Object name     Assignment Operator     new keyword     Constructor==>Class name +()
           Scanner            input                 =                   new               Scanner(System.in);

        //2.Step: Give a message to user about the data you ask
        System.out.println("Enter Your Address");
        String address=input.nextLine();
        System.out.println(address);

        System.out.println("Enter Your Age");
        //3.Step: Get the data by the help of the "input" object
        int age=input.nextInt();
        System.out.println(age);

        System.out.println("Enter Your Name");
        String name=input.next();
        System.out.println(name);
    }
}
