public class CompareStrings {
    public static void main(String args[]){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        // if(s1 == s2){
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        // if(s1 == s3){
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

    }
}
