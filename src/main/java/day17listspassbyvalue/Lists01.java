package day17listspassbyvalue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {

    public static void main(String[] args) {

        //Example 1: Type code to make all elements in a List unique
        //           [2, 3, 2, 2, 5] ==> [2, 3, 5]
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        List<Integer> b = new ArrayList<>();

        for(Integer w : a){
            if(!b.contains(w)){
                b.add(w);
            }
        }
        System.out.println(b);

        //Example 2: Ask user to enter a letter, if the letter exists inside the list, convert the element to "Got it"
        //           otherwise, add the element into the list
        //           [A, K, R, S] ==> User --> K ==> [A, Got it, R, S]
        //           [A, K, R, S] ==> User --> P ==> [A, K, R, S, P]

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter...");
        String str = input.next();

        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");

        if(c.contains(str)){
            c.set(c.indexOf(str) ,"Got it");//indexOf() method gives you the index of first occurrence of a specific element
            //indexOf() method returns -1 for non-existing elements
        }else{
            c.add(str);
        }
        System.out.println(c);


        List<String> d = new ArrayList<>();
        d.add("Ab");
        d.add("Kl");
        d.add("Rs");
        d.add("St");
        d.add("Rs");

        int e = d.indexOf("Rs");
        System.out.println(e);//2

        int f = d.indexOf("Xy");
        System.out.println(f);//-1

        //Note: How can you understand the existence of a specific element in a List?
        //      i) Use indexOf() method if the result is "-1" it means the element does not exist,
        //      if the result is not "-1" it means the element exists
        //      ii) Use contains()

        int h = d.lastIndexOf("Rs");//lastIndexOf() method gives you the index of last occurrence of a specific element
        //lastIndexOf() method returns "-1" for non-existing elements
        System.out.println(h);//4

    }
}