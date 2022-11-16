public class Assignment5a {

    public static float averageOfThree(float a, float b, float c){
        return (a + b + c)/3;
    }
    public static void main(String args[]){
        float avg = averageOfThree(15f, 20f, 15f);
        System.out.println("Average of three numbers is " + avg);
    }
}