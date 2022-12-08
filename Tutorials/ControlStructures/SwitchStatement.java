package ControlStructures;
public class SwitchStatement {
    public static void main(String args[]){
        int number = 3;
        switch (number) {
            case 1: System.out.println("Pizza");
                    break;
            case 2: System.out.println("Burger");
                    break;
            case 3: System.out.println("Momos");
                    break;
            default: System.out.println("I woke up!");
        }

        char ch = 'a';

        switch(ch) {
            case 'a': System.out.println("Biryani");
                      break;
            case 'b': System.out.println("Chilli garlic noodles");
                      break;
            case 'c': System.out.println("Chicken Shawarama");
                      break;
            default: System.out.println("woke up!");
        }
    }
}
