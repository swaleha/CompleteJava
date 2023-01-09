/*
 * Output of the code: 13245
 * Note: Instance initialization blocks are executed before the constructor
 */
abstract class Car {
    static {                            //Block
        System.out.print("1");
    }

    public Car(String name){            //constructor
        super();
        System.out.print("2");
    }

    {
        System.out.print("3");
    }
}

public class BlueCar extends Car {

    {                                   //Block
        System.out.print("4");
    }

    public BlueCar() {                  //Constructor
        super("blue");
        System.out.print("5");
    }
    public static void main(String[] gears) {
        new BlueCar();
        System.out.println();
    }
}
