package day15multidimensionalarraylists;

public class MultiDimensionalArrays04 {

    public static void main(String[] args) {

        //Example 1: Find the maximum element in a two-dimensional array
        //           { {5, 0}, {-2, 4}, {65, -12, 23} }

        int arr[][] = { {5, 0}, {-2, 4, 10} };

        int max = arr[0][0];
        // [ [5, 0], [-2, 4, 10] ]
        for(int[] w : arr){
            for(int u : w){
                //1.Way
                //if(max < u){
                //max = u;
                //}
                //2.Way
                max = Math.max(max, u);// max() method selects the maximum value of the given two numbers
            }
        }
        System.out.println(max);
    }

}
