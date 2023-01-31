package day18datetimeclassvarargs;

public class IncrementDecrement01 {

    public static void main(String[] args) {

        int a = 12;
        int b = a++;//Post Increment
        System.out.println(b);//12
        System.out.println(a);//13

        int x = 15;
        int y = x--;//Post Decrement
        System.out.println(x);//14
        System.out.println(y);//15

        int m = 21;
        int n = ++m;//Pre Increment
        System.out.println(m);//22
        System.out.println(n);//22

        int t = 32;
        int u = --t;// Pre Decrement
        System.out.println(t);//31
        System.out.println(u);//31

    }
}
