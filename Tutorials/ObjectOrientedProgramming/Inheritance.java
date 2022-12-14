/*
 * Inheritance: One of the pillars of OOPS. Here derived/child class inherits the properties and methods of the base/parent class
 * 1. Single inheritance: Parent/Base class -> Derived/class
 * 2. Multi-level inheritance:
 *  Base class -> derived class1 -> derived class2
 *  (eg. Animal -> Mammal -> Cat)
 *  3. Hierarchial inheritance:
 *  Base class -> Derived class1, Base class -> Derived class2, Base class -> Derived class3
 *  (eg. Animal -> Mammal, Animal -> Fish, Animal -> Bird)
 *  4. Hybrid Inheritance: It's the combination of multi-level and hierarchial inheritance
*/

public class Inheritance{
        public static void main(String[] args) {
            Fish salmon = new Fish();
            salmon.eat();

            Cat tom = new Cat();
            tom.eat();
            tom.legs = 4;
            tom.breed = "Siberian";

            Bird budgie = new Bird();
            budgie.fly();
            budgie.breathe();

            Mimic parakeet = new Mimic();
            parakeet.mimicking();
        }
    }

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

class Jawless extends Fish {
    String mouth = "round";
}

class Bony extends Fish {
    String bone = "skeleton";
}


/*
 * Hierarchial inheritance
 */

class Bird extends Animal {
    void fly(){
        System.out.println("Flies");
    }
}

class Mimic extends Bird {
    void mimicking(){
        System.out.println("Mimics");
    }
}

class Ratites extends Bird {
    void run(){
        System.out.println("Runs");
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
    void meow(){
        System.out.println("Meows");
    }
}

/* */
class Dog extends Mammal {
    String breed;
    void bark(){
        System.out.println("barks");
    }
}









