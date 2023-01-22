package day08stringmanipulationloops;

public class StringManipulations01 {

    public static void main(String[] args) {

        String str = "Java is easy. Java is OOP.";
        String result1 = str.replaceFirst("Java", "Apex");
        String result2 = str.replace("Java", "Apex");
        System.out.println(result1);
        System.out.println(result2);

         /*
            Example 1:  String shirtPrice = "$12.99";
                        String bookPrice = "$35.99";
                        Type code to find the sum of the shirt and book prices.
         */

        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        String shirt = shirtPrice.replace("$", "");
        System.out.println(shirt);//12.99

        String book = bookPrice.replace("$", "");
        System.out.println(book);

        //valueOf() method converts String data type to numeric data type
        //Note: To be able to use valueOf() method, String must be in numeric format

        double shirtInDouble = Double.valueOf(shirt);
        double bookInDouble = Double.valueOf(book);

        System.out.println("Total price is " + (shirtInDouble + bookInDouble));

        /*
            Example 2: Swap the integers
                       a=12    b=23    ==>    a=23    b=12
        */

        int a = 12, b=23;

        //1.Way: We used third variable
        int temp = 0;
        temp = b;
        b= a;
        a = temp;
        System.out.println(a);//23
        System.out.println(b);//12

        //2.Way: Without using third variable
        int x=14, y=25;
        y = y - x;
        x = y + x;
        y = x - y;

        System.out.println(x);//25
        System.out.println(y);//14

    }

}
