/* Polymorphism: Methods with same name but different forms

 * 1. Compile Time Polymorphism: It is static. Compiler knows which function to call during the compile time. 
 * Method overloading is an example of Compile Time Polymorphism
 * Method Overloading: Methods with same name but different number of parameters or different types of parameters
 *
 * 2. Run Time Polymorphism: It is Dynamic. When child class inherits the parent class and these classes have the function with same name but different definition. 
 * Child class overrides the definition of parent class. This is called Method Overriding. This happens at run time so it is dynamic.
 */
public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Herbivore deer = new Herbivore();
        deer.eat();
    }
}

/* Method Overriding */
class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
}

class Herbivore extends Animal {
    void eat(){
        System.out.println("Eats grass");
    }
}


/* Method overloading */
class Calculator {
    int sum (int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}


