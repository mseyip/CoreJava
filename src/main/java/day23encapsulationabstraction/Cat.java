package day23encapsulationabstraction;

public class Cat extends Mammal {

    public void meow(){
        System.out.println("Cats meow...");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat...");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink...");
    }

}
