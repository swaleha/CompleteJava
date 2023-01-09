/*
 * Static Keyword in Java is used to share the same variable or method of a given class
 * Static keyword can be used for:
 * - Properties
 * - Functions
 * - Blocks
 * - Nested Classes
 * 
 */
public class StaticKeywordUsage {

    // main() method is static because we want to have only one main method for a public class
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "VTU";          // All the objects of the class Student will have same school name VTU since the schoolName varibale is static 
        System.out.println(s1.schoolName);

        Student s2 = new Student();
        System.out.println(s2.schoolName);  

        Student s3 = new Student();
        System.out.println(s3.schoolName);

        Student.Department s4 = new Student.Department();  //instance of nested class Department
        s4.display();
    }
}

class Student {
    String name;
    String roll;

    static String schoolName;
    int n = 100;

    // only one instance of the returnPercentage() method is created even if multiple objects are created for the Student class
    static int returnPercentage(int phy, int math, int chem){
        // n = 200; compilation error for making static reference to a non-static field
        return (phy + chem + math)/3;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }


    //static Nested class
    static class Department{
        public void display(){
            System.out.println("There are 5 departments in the school " + schoolName);
        }
    }
}
