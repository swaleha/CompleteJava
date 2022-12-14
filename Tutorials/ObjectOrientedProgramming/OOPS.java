public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println("Pen color: " + p1.color);

        p1.setTip(5);
        System.out.println("Pen tip thickness: " + p1.tip);

        p1.color = "Green";
        System.out.println("Pen color: " + p1.color);

        BankAccount myAccount = new BankAccount();
        myAccount.setPassword("HelloWorld333!");
        myAccount.username = "TonyStark";
    }
}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String newPassword){
        password = newPassword;
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        float percentage = (phy + chem + math) / 3;
    }
}
