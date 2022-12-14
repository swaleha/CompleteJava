//Base class or parent class 
public class Animal {

    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
    
    public static void main(String[] args) {
        Fish salmon = new Fish();
        salmon.eat();
    }
}

//Derived class or child class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims");
    }
}
