package day03ifstatement;

import java.util.Scanner;

public class Practise2 {
    public static void main(String[] args) {
        /*Example 1:Type a program which calculates the area and the perimeter of a square
                    whose side length is entered by user.
                    Hint 1: Area of a square is length x length
                    Hint 2: Perimeter of a square is 4x length*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length please");
        double l=input.nextDouble();

        System.out.println("The area of square is: "+ l*l);
        System.out.println("The perimeter of square: "+ 4*l);

        /*Example 2: Type a program which calculates the cube of a number which is entered by user.
                    Hint 1: Cube of a number is a x a x a*/
        System.out.println("Enter a number please");
        int num=input.nextInt();
        System.out.println("Cube of "+num+": "+(num*num*num));

        /*Example 3: Type a program which calculates the area and the perimeter of a rectangle
                    whose length and with are entered by user.
                    Hint 1: Area of a rectangle is width x length
                    Hint 2: Perimeter of a rectangle is 2x (width + length*/
        System.out.println("Enter the length please");
        double l1=input.nextDouble();

        System.out.println("Enter the width please");
        double w1=input.nextDouble();

        System.out.println("The area of rectangle is: "+w1*l1);
        System.out.println("The perimeter of rectangle is : "+2*(w1+l1));
    }
}
