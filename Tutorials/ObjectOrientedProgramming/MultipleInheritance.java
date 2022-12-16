/*
 * Multiple inheritance in Java can only be achieved using interfaces
 * If A and B are parent classes,
 * then Child class C inheriting all properties of classes A and B
 * is called Multiple inheritance
 */

public class MultipleInheritance {
    public static void main(String[] args) {
        Omnivore bear = new Omnivore();
        bear.eat();
    }
}

interface Herbivore {
    void eat();
}

interface Carnivore {
    void eat();
}

class Omnivore implements Herbivore, Carnivore {
    public void eat(){
        System.out.println("eats meat and plants");
    }
}