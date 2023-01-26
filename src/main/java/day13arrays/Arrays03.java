package day13arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {

    public static void main(String[] args) {

        //Example 1: Let user enter student names into the application
        // (Create an Array together with the user)
        Scanner input = new Scanner(System.in);

        //1.Step: Create an Array
        System.out.println("Enter the number of the students you want to enter");
        int numOfStd = input.nextInt();
        String names[] = new String[numOfStd];

        //2.Step: Insert the elements into the Array
        for(int i=0; i<numOfStd; i++){
            System.out.println("Enter the " + (i + 1) + ". student name. To stop insertion press Q");
            String stdName = input.next();
            if(!stdName.equalsIgnoreCase("q")) {
                names[i] = stdName;
            }else{
                break;
            }
        }
        System.out.println(Arrays.toString(names));
    }

}
