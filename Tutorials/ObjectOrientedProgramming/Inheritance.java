/*
 * Inheritance: One of the pillars of OOPS. Here derived/child class inherits the properties and methods of the base/parent class
 */

public class Inheritance{
        public static void main(String[] args) {
            Fish salmon = new Fish();
            salmon.eat();

            Cat tom = new Cat();
            tom.eat();
            tom.legs = 4;
            tom.breed = "Siberian";
        }
    }

//Base class or parent class
class Animal {

    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}

/*Derived class or child class*/
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims");
    }
}

/*
 *  Hierarchial inheritance:
 *  Base class -> Derived class1,
 *  Base class -> Derived class2,
 *  Base class -> Derived class3
 *  Eg, Animal -> Mammal, Animal -> Fish, Animal -> Bird
 */

class Bird extends Animal {
    void fly(){
        System.out.println("Flies");
    }
}

class Mammal extends Animal {
    int legs;
    void walk(){
        System.out.println("Walks");
    }
}

/*  Multi-level inheritance:
 *  Base class -> derived class1 -> derived class2
 *  (eg, Animal -> Mammal -> Cat)
 */

class Cat extends Mammal {
    String breed;
}









