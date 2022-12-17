/*
 * Super keyword is used to refer to immediate parent's class object
 * - to access parent's properties
 * - to access parent's functions
 * - to access parent's constructor
 */
public class SuperKeywordUsage {
    public static void main(String[] args) {
        Horse mustang = new Horse();
        System.out.println(mustang.color);
        mustang.walk();
    }
}

class Animal {
    String color;
    void walk(){
        System.out.println("walks");
    }
    Animal(){
        System.out.println("Animal constructor is called");
    }

}

class Horse extends Animal{
    Horse(){
        super();    //even if super() method is not called in the child's constructor, Java by default calls the parent class' constructor when object of child's class is created
        super.color = "brown";
        super.walk(); //accessing parent's walk() method in child class' constructor using super keyword
        System.out.println("Horse constructor is called");
    }
}