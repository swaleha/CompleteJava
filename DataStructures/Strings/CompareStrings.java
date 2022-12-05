public class CompareStrings {
    public static void main(String args[]){
        String s1 = "Arham";
        String s2 = "Arham";
        String s3 = new String("Arham");

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
