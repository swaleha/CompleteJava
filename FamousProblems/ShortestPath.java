import java.util.*;
public class ShortestPath {

    public static float getShortestPath(String path){

        int x = 0, y = 0;
        for(int i=0; i<path.length();i++){

            char dir = path.charAt(i);

            //NORTH
            if(dir == 'N'){
                y++;
            } 
            
            //SOUTH
            else if(dir == 'S'){
                y--;
            }

            //EAST

            else if(dir == 'E'){
                x++;
            }

            //WEST

            else {
                x--;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String args[]){
        String path = "WNEENESENNN"; //"NS";
        System.out.println("Shortest path is: " + getShortestPath(path));
    }
    
}
