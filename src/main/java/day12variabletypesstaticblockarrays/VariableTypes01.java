package day12variabletypesstaticblockarrays;

public class VariableTypes01 {

    //"name" is "non-static" or "object" or "instance" variable
    public String name = "Tom Hanks";

    //"age" is "static" or "class" variable
    public static int age = 13;
/*
    local variable
    If you create a variable inside a method, it is called "local variable"
    Note: When you create a "local variable" it is mandatory to assign a value.
          If you try to use a local variable without assigning a value it complains.

    Note: Local variables can be used just inside the method
          If you try to use it outside the method it will give error

    Note: If the return type is different from "void"
          you have to use "return" keyword inside the method

    Note: When you create a method use the "return" keyword in the last line.
          You cannot type any code after "return" keyword

*/
    public int add(int a, int b){
        int x=13;//local variable
        System.out.println(name);
        return a + b;
    }

    //Create a method to do multiplication
    public int multiply(int c, int d){
        String s = "Java";//local variable
        return c*d;
    }

}


