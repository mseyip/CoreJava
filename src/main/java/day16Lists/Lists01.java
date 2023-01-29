package day16Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {

    public static void main(String[] args) {

        //How to create a List(Arraylist)
        //1.Way:
        ArrayList<Integer> myList1 = new ArrayList<Integer>();
        //2.Way:
        ArrayList<Integer> myList2 = new ArrayList<>();
        //3.Way:
        List<Integer> myList3 = new ArrayList<>();

        //How to print a list on the console
        System.out.println(myList3);// []

        //How to add elements into a list
        //Note: add() method puts the elements in insertion order
        myList3.add(12);
        myList3.add(7);
        myList3.add(23);
        System.out.println(myList3);// [12, 7, 23]

        //How to add an element into a specific index
        myList3.add(1, 50);
        System.out.println(myList3);// [12, 50, 7, 23]
        myList3.add(3, 99);
        System.out.println(myList3);// [12, 50, 7, 99, 23]

        //How to join two lists
        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        List<String> b = new ArrayList<>();
        b.add("X");
        b.add("Y");
        b.add("Z");

        a.addAll(b);
        System.out.println(a);// [A, B, X, Y, Z]
        System.out.println(b);// [X, Y, Z]

        a.addAll(1, b);
        System.out.println(a);// [A, X, Y, Z, B, X, Y, Z]

        //How to get the number of elements in a List
        int sizeOfA = a.size();
        System.out.println(sizeOfA);// 8

        int sizeOfB = b.size();
        System.out.println(sizeOfB);// 3

        //Note: When you talk about the number of the elements in an Array use "length of the array", for the lists use "size of the list"

        //Example 1: Type code to check if the given list is empty or not?
        List<Character> c = new ArrayList<>();
        c.add('x');
        c.add('y');

        //1.Way:
        int sizeOfC = c.size();
        if(sizeOfC==0){
            System.out.println("The list is empty");
        }else{
            System.out.println("The is not empty");
        }

        //2.Way: Java created a method to check if a list is empty or not
        //       isEmpty() method returns "true" if the list does not have any element
        //       isEmpty() method returns "false" if the list has at least one element
        boolean isEmpty = c.isEmpty();
        if(isEmpty){
            System.out.println("The list is empty");
        }else{
            System.out.println("The is not empty");
        }
        //Note: If Java has a method for specific functionality using the method is preferable

        //Example 2: Type code to check if the list does not have any element different from space or the list does not have any element
        //           [] ==> Acceptable        [ , , ] ==> Acceptable       [a] ==> Not Acceptable    ...
        List<String> d = new ArrayList<>();
        d.add(" ");
        d.add(" ");
        d.add(" ");
        //d.add("a");
        System.out.println(d);// [ , , , a]

        //To be able to use removeAll() method you need List, therefore we created a list contains space character
        List<String> e = new ArrayList<>();
        e.add(" ");

        //removeAll() method is used to remove multiple elements from a List
        //When you use removeAll() method, you will need a list stores the elements you want to remove
        d.removeAll(e);
        System.out.println(d);// [a]

        if(d.isEmpty()){
            System.out.println("The list is empty or has just space character");
        }else{
            System.out.println("The list has character/s different from space");
        }

    }

}
