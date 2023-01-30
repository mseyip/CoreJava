package day17listspassbyvalue;

public class PassByValue01 {

    /*
        1)When you use a variable inside a method, Java creates the copy of the variable and uses it inside the method.
          Java does that to protect the original value of the variables.
          If in every method usage, the value changes, it creates very big problems.

        2)Some programming languages do not use "Pass by value" they use "Pass by reference".
         If you use "Pass by reference" original will change in every method usage

        3)If you insist on changing the original value in Java you can do it as well.
          Assign the updated value to the original variable then original value will be updated
     */
    public static void main(String[] args) {
        int price = 20;
        price = change(price);
        System.out.println(price);//40
    }

    public static int change(int a){
        return a*2;



    }

}
