public class LargestOfThree {
    public static void main(String args[]){
        int A = 11, B = 3, C = 6;
        if((A >= B) && (A >= C)){
            System.out.println("Largest of three is A");
        } else if(B >= C) {
            System.out.println("Largest of three is B");
        } else {
            System.out.println("Largest of three is C");
        }
    }
}
