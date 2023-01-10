package day01variables;

public class Practise1 {
    public static void main(String[] args) {
        /*1) Create double variables for the prices of any 3 items. Print the sum of the prices on the
        console with a label*/
        double shirtPrice=12.99;
        double hatPrice=23.99;
        double shoesPrice=15.99;
        System.out.println("Total Price: "+(shirtPrice+hatPrice+shoesPrice));

        /*2) Create a float variable, a long variable, and an integer variable for any 3 items. Print the
multiplication of the values on the console with a label*/
        float x=15.99F;
        long y=13L;
        int z=12;
        System.out.println("Multiplication: "+x*y*z);

        /*Type a code to find simple interest.
Note: Simple interest formula = principal * rate * numberOfYear / 100*/
        int principal=10000,rate=6,numberOfYear=3;
        int simpleInterest=principal*rate*numberOfYear/100;
        System.out.println("The Simple Interest Is: "+simpleInterest);

        /*4) Create a String and two Long variables. Print the sum and the multiplication of the long
variables with the String on the console.*/
        String s="The result is: ";
        long a=123L;
        long b=9123456782L;
        System.out.println(s+(a+b));
        System.out.println(s+a*b);

        /*5) Create two boolean variables whose values are different and print their values in the same
line with a space between two consecutive values*/
        boolean a1=true;
        boolean b1=false;
        System.out.println(a1+" "+b1);

        /*6) Create 3 float variables for the price of a book, notebook, and laptop.
Print the total price of 2 books, 4 notebooks and 3 laptops on the console */
        float book=12.99F,noteBook=23.45F,laptop=34.12F;
        float totalPrice=2*book+4*noteBook+3*laptop;
        System.out.println("Total Price Is: "+totalPrice);

        /*1) Create a short variable and convert it to an int variable*/
        short age=12;
        int newAge=age;

        /*2) Create a long variable and convert it to an int variable*/
        long age1=12L;
        int newAge1=(int) age1;

        /*3) Create a double variable and convert it to a float variable*/
        double price=2.34;
        float newPrice=(float)price;

        /*4) Create a double variable and convert it to a short variable, then print the value of the short
variable on the console. Be careful about the output, it will not be a decimal value.*/
        double price1=1.2;
        short newPrice1=(short)price1;
        System.out.println(newPrice1);

        /*5) Create a byte variable and convert it to a double variable, then print the value of the double
variable on the console. Be careful about the output, it will be a decimal number.*/
        byte age2=23;
        double newAge2=age2;
        System.out.println(newAge2);
    }
}
