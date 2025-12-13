public class interfaceeee{
    public static void main(String args[]){
    Queen q = new Queen();
    q.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("up,down,left ,right,diagonally (in all 4 direction)");
    }
}
class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("up,down,left ,right");
    }
}
class King implements ChessPlayer {
    public void moves(){
        System.out.println("up,down,left ,right,diagonally(by 1 step)");
    }
}

//multiple inheritance..
interface Herbivore {

}
interface Carnivore {

}
class Bear implements Herbivore , Carnivore {
    
}