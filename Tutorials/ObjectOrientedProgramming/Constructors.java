public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student(); /* Non-parameterized constructor */
        //Student s2 = new Student("TonyStark"); /* Parameterized constructor */
       //Student s3 = new Student(121);  /* Parameterized constructor */

        s1.name = "Tony Stark";
        s1.rollNo = 120;
        s1.password = "abcd";

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s4 = new Student(s1);       //copy constructor
        s4.password = "xyz";

        s1.marks[2] = 100;


        for(int i=0; i<3; i++){
            System.out.print(s4.marks[i] + " ");
        }
        System.out.println();

    }
}

class Student{
    String name;
    int rollNo;
    String password;
    int marks[];

    //float percentage;
    // void calcPercentage(int phy, int chem, int math){
    //     float percentage = (phy + chem + math) / 3;
    // }

    /* Parameterized constructor */
    Student(String name){
        marks = new int[3];
        this.name = name;
        //System.out.println(this.name);
    }

    /* Parameterized constructor */
        Student (int rollNo){
            marks = new int[3];
            this.rollNo = rollNo;
            //System.out.println(this.rollNo);
        }

    /*  Non-parameterized constructor */
    Student(){
        marks = new int[3];
        System.out.println("Constructor is called..");
    }

    /* Shallow Copy constructor: Here the references are copied so changes in the marks array reflect */
    // Student (Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollNo = s1.rollNo;
    //     this.marks = s1.marks;           // shallow copy
        // System.out.println(this.name);
        // System.out.println(this.rollNo);
        // System.out.println(this.password);
    // }


    /* Deep Copy Constructor: New array is created so changes to the existing array don't reflect */
    Student (Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        
        for(int i=0; i<3; i++){
            this.marks[i] = s1.marks[i];    //deep copy
        }
    }
}
