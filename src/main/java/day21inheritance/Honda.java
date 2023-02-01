package day21inheritance;

public class Honda extends Car {

    public void hondaMake(){
        System.out.println("This car was made in Honda factory");
    }

    public Honda(){
        System.out.println("Honda class constructor 1");
    }

    public Honda(boolean isNew){
        super("Hybrid");
        if(isNew){
            System.out.println("Brand new");
        }else{
            System.out.println("Used");
        }
    }

}
