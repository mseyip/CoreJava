package day23encapsulationabstraction;

public class StudentRunner {

    /*
                                            -Encapsulation-
                Encapsulation is "data hiding"
                To hide a data we make the access modifier "private"
                After "hiding data", you may need to "read" or "update" the data.
                To "read" or "update" the data we will create some methods.
                To "read" "encapsulated data" you should create "get()" methods, we name it "getters"
                To "update" "encapsulated data" you should create "set()" methods, we name it "setters"

                "get()" and "set()" methods are called "Java Beans"

                If a class is "immutable", it is impossible to change the value of the existing variable.
                If you want to make a class "immutable" do not create any "setter" method
         */

    public static void main(String[] args) {

        Student std1 = new Student();

        System.out.println(std1.name);
        System.out.println(std1.getStdId());

        std1.setDisease(null);
        System.out.println(std1.getDisease());

        std1.setStdGpa(4.0);
        System.out.println(std1.getStdGpa());//4.0

    }

}
