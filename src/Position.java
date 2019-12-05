// A class representing a position in the game


public class Position {
    Entity[][] playingField;


    public void Position(boolean[][] passable) {
        int length = passable.length;
        int width = passable[0].length;
        playingField = new Entity[length][width];
    }

    Entity[][] getPosition() {  //might need a better name
    return this.playingField;
    }







}
