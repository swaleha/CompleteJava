/*
 * Encapsulation: Wraps data and methods into a single entity/capsule. 
 * Eg. Data Hiding is implemented using Encapsulation
 *
 * Different Access Specifiers/Modifiers are used to implement data hiding.
 * Private < Default < Protected < Public
 */
public class Encapsulation {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println("Pen color: " + p1.getColor());
        //System.out.println("Pen color: " + p1.color);

        p1.setTip(5);
        System.out.println("Tip thickness: " + p1.getTip());
        //System.out.println("Pen tip thickness: " + p1.tip);

        p1.setColor("Green");
        System.out.println("Pen color: " + p1.getColor());

        // BankAccount myAccount = new BankAccount();
        // myAccount.setPassword("HelloWorld333!");
        // myAccount.username = "TonyStark";
    }
}



class Pen {
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String color){
        this.color = color;
    }

    void setTip(int tip){
        this.tip = tip;
    }
}



// class BankAccount{
//     public String username;
//     private String password;

//     public void setPassword(String newPassword){
//         password = newPassword;
//     }
// }
