/*
 * Calling one constructor from another is constructor chaining
 * Results in readable code and avoids duplicate code because we can perform multiple tasks within a single constructor
 * Constructor chaining is done within same class using this() keyword
 * and from base/parent class through super() keyword
 *
 */
public class ConstructorChaining {
    public static void main(String[] args) {
        Base b1 = new Base();
        System.out.println("******************\n");
        Base b2 = new Base("Hello");
        System.out.println("******************\n");
        Base b3 = new Base(3, 4);
        System.out.println("******************\n");

        Derived d = new Derived("Best wishes");
    }
}

class Base {

    // This block executes first
    {
        System.out.println("Init block");
    }
    String name;

    Base(){
        System.out.println("default");
    }

    Base(String name){
        this();
        System.out.println("Parameterized constructor of Parent class: " + name);
    }

    Base(int x, int y){
        this("Hi");
        System.out.println(x * y);
    }
}

class Derived extends Base{
    Derived (){
        System.out.println("Derived class default constructor called");
    }

    Derived(String name){
        super(name);
        System.out.println("Parameterized constructor of derived class: " + name);
    }


}
