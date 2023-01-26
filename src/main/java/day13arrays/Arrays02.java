package day13arrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 1: Create a String Array and print the elements in alphabetical order on the console in different lines
        String cities[] = new String[5];
        cities[0] = "Tokyo";
        cities[1] = "Berlin";
        cities[2] = "Istanbul";
        cities[3] = "Jacksonville";
        cities[4] = "Calgary";
        System.out.println(Arrays.toString(cities));//[Tokyo, Berlin, Istanbul, Jacksonville, Calgary]

        //How to put elements in alphabetical order
        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));//[Berlin, Calgary, Istanbul, Jacksonville, Tokyo]
        for(String w : cities){
            System.out.println(w);
        }

        //Note: To get the number of characters from a String use "length()"
        //      To get the number of elements from an Array use "length"

        //Example 2: Create a String Array and print the elements whose length is less than 5
        //Short way to create an array and add elements into the array
        String names[] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};
        System.out.println(Arrays.toString(names));//[Ali, Thomas, Mark, Jackson, Tom, Martin]
        for(String w : names){
            if(w.length()<5){
                System.out.println(w);
            }
        }

        System.out.println("=====");

        //Example 3: Create a String Array and print the elements before "Tom"
        String students[] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};
        for(String w : students){
            if(w.equals("Tom")){
                break;
            }
            System.out.println(w);
        }

        System.out.println("======");

        //Example 4: Create a String Array and print the elements before "Tom" and "Tom"
        //[Ali, Thomas, Mark, Jackson, Tom, Martin]
        for(String w : students){
            System.out.println(w);
            if(w.equals("Tom")){
                break;
            }
        }

        System.out.println("======");

        //Example 5: Create a String Array and print the elements different from "Tom"
        String employees[] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};
        for(String w : employees){
            if(w.equals("Tom")){
                continue;
            }
            System.out.println(w);
        }

    }

}