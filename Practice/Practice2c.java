public class Practice2c {
    public static void main(String[] args){
        float x, y, z;
        x = y = z = 2f;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x +" "+y+" "+z);
    }
}
