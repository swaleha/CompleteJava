public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("TonyStark");
        Student s3 = new Student(121);
    }
}

class Student{
    String name;
    int rollNo;
    float percentage;

    // void calcPercentage(int phy, int chem, int math){
    //     float percentage = (phy + chem + math) / 3;
    // }


    /* Parameterized constructor */
    Student(String name){
        this.name = name;
        System.out.println(this.name);
    }

    /* Parameterized constructor */
        Student (int rollNo){
            this.rollNo = rollNo;
            System.out.println(this.rollNo);
        }

    /*  Non-parameterized constructor */
    Student(){
        System.out.println("Student is called..");
    }
}
