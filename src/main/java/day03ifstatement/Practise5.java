package day03ifstatement;

import java.util.Scanner;

public class Practise5 {
    public static void main(String[] args) {
        /*Example 9: Type a program which asks user to enter his/her first name and last name, then print it on the console.
                    Hint: To get String, use nextLine()
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String name=input.nextLine();
        System.out.println(name);*/

        /*Example 10: Type a program which asks user to enter his/her full name, and address then print them on the console
                    like the full name should be in the first line, and the address will be in the second line.
                    Hint: To get String, use nextLine()*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name please");
        String fullName = input.nextLine();
        System.out.println("Enter your address please");
        String address = input.nextLine();
        System.out.println(fullName);
        System.out.println(address);
    }
}
