package day23encapsulationabstraction;

/*
        1)Sometimes no child uses the implementation from the parent class, therefore
          the body part of the method in parent class is being unusable.
          If something is unusable we do not want to type it.
          If you do not type the body of a method, you will have "method without body"(Like angels),
          it is called "Abstract Method"

        2)"Concrete Methods"(Methods with body) focus on 2 things; i)What to do ii)How to do
          "Abstract Methods" focus on just "What to do"

        3)If you make a method "abstract", it will be mandatory to override for all child classes

        4)"Abstract Methods" can be created just in "Abstract Classes"
          To make a Class abstract put "abstract" keyword between "access modifier" and "class" keyword

        5)When you remove "method body" you have to use "abstract" keyword between the "access modifier" and the "return type" of the method

        6)It is impossible to create "object" from an "abstract class" but it does not mean "abstract classes" do not have "constructors"
          They have "constructors" but "constructors" are not used to create objects

        7)"Abstract Classes" can have "concrete methods" as well.

        8)"Concrete Methods" may or may not be overridden by Child Classes

        9)"Abstract Methods" cannot be put into a non-abstract class
     */

public abstract class Animal {

    public abstract void eat();

    public abstract void drink();

    public void move() {
        System.out.println("Animals move...");
    }
}
