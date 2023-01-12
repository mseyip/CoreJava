package day03ifstatement;

import java.util.Scanner;

public class Practise3 {
    public static void main(String[] args) {
        /*Example 4: Type a program which calculates the volume of a rectangular prism whose length, width, and height
                    are entered by user.
                    Hint 1: Volume of a rectangular prism is width x length x height
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width, length and height please");
        double w=input.nextDouble();
        double l=input.nextDouble();
        double h=input.nextDouble();
        System.out.println("The volume of a rectangular prism is: "+w*l*h);

        /*Example 5: Type a program which calculates the area and the perimeter of a circle whose radius is entered by user. (Use float)
                    Hint 1: Take pi number as 3.14159
                    Hint 2: Area of a circle is 3.14159 * radius * radius
                    Hint 3: Perimeter of a circle is 2 * 3.14159 * radius
                    Hint 4: To get float, use nextFloat()*/
        System.out.println("Enter the radius please");
        float r=input.nextFloat();
        final double pi=3.14159;

        System.out.println("Area of Circle: "+pi*r*r);
        System.out.println("Perimeter of Circle: "+2*pi*r);

        /*Example 6:) Type a program which calculates the perimeter of a triangle whose side lengths are
                    entered by user. (Use byte)
                    Hint 1: Perimeter of a triangle is a + b + c
                    Hint 2: To get byte, use nextByte()*/
        System.out.println("Enter side lengths please");
        byte a= input.nextByte();
        byte b= input.nextByte();
        byte c= input.nextByte();

        System.out.println("The perimeter of a triangle: "+(a+b+c));
    }
}
