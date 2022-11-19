public class Patterns {


    public static void hollow_rectangle(int totalRows, int totalCols){
        //outer-loop
        for(int i=1; i<=totalRows; i++){
            //inner-columns
            for(int j=1; j<=totalCols; j++){
                //cell(i, j)
                if( i == 1 || i == totalRows || j == 1 || j == totalCols){
                    // boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n){
        //outer loop - for number of lines or rows
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid(int n){
        //outer loop corresponds to the number of lines or rows
        for(int i=1; i<=n; i++){
            // inner - numbers
            for(int j=1; j<=(n-i+1); j++){
                System.out.print(j + " ");
            }
            System.out.println(); //prints newline after printing numbers for every row
        }
    }

    public static void floyds_triangle(int n){
        int counter = 1;

        //outer loop for the number of rows/lines
        for(int i=1; i<=n; i++){
            //inner loop for printing counter 
            for(int j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n){
        //outer loop - total rows/lines
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
     public static void butterfly(int n){
        //1st half 

        for(int i=1; i<=n; i++){

            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces - 2*(n-i)
            for(int j=1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }

            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println(); //Goes to newline after every row
        }


        //2nd half

        for(int i=n; i>=1; i--){

            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }

     public static void solid_rhombus(int n){
        //outer loop - number of lines
        for(int i=1; i<=n; i++){

             //spaces - (n-i)
             for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars - n
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();
        }
     }

    public static void hollow_rhombus(int n){
        //outer loop - number of lines or rows
        for(int i=1; i<=n; i++){

            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //hollow_rectangle
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
        public static void diamond(int n){

            //1st half
            for(int i=1; i<=n; i++){

                //spaces - (n-i)
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }

                //stars - ((2*i)-1)
                for(int j=1; j<=(2*i)-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            //2nd half

            for(int i=n; i>=1; i--){
                //spaces - (n-i)
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }

                //stars - (2*i -1)
                for(int j=1; j<=(2*i)-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    


    public static void main(String args[]){
        //hollow_rectangle(6, 7);
        //inverted_rotated_half_pyramid(4);
        //inverted_half_pyramid(5);
        //floyds_triangle(5);
       //zero_one_triangle(5);
       //butterfly(5);
       //solid_rhombus(5);
       //hollow_rhombus(5);
       diamond(7);
    }
    
}