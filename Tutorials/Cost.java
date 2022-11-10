import java.util.*;
public class Cost {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float new_pencil_cost = pencil + (pencil * 0.18f);
        float new_pen_cost = pen + (pen * 0.18f);
        float new_eraser_cost = eraser + (eraser * 0.18f);

        float total_cost = new_pencil_cost + new_pen_cost + new_eraser_cost;

        System.out.println("The total cost of items with GST is: "+total_cost);
    }
    
}
