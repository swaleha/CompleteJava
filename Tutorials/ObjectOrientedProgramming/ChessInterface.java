/*
 * Interface is blueprint of class
 * Interfaces help in achieving multiple inheritance (Child is inherited from two or more parents) and total abstraction
 * Interfaces have public, abstract methods without implementation
 * Variables in interfaces can be final, public and static
 */

public class ChessInterface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Queen moves up, down, left, right, diagonal (in all 5 directions)");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("King moves up, down, left, right, diagonal (by 1 step)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Rook moves up, down, left, right");
    }
}
