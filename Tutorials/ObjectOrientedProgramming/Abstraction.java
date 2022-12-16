/*
 * Abstraction: Hiding all the unnecessary details and showing only the important parts to the user
 * Abstract classes cannot be instantiated
 * Abstract classes can have constructors
 * Abstract class can have both abstract and/or non-abstract methods
 */
public class Abstraction {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();        //calls constructors from Animal, Horse and Mustang class
        
        System.out.println("***************");
        Horse h = new Horse();                  //calls constructors from Animal and Horse class
        h.walk();
        System.out.println(h.color);        //uses color from Animal class
        h.changeColor();                    //prints color from Horse class

        System.out.println("***************");
        Kangaroo k = new Kangaroo();
        k.walk();
    }
}

abstract class Animal{
    String color = "brown";
    Animal(){
        System.out.println("Animal constructor called");
    }
    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("Walks on 4 legs");
    }
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        System.out.println("White");
    }

}

class Mustang extends Horse{
        Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Kangaroo extends Animal{
    void changeColor(){
        System.out.println("Dark brown");
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}

 
