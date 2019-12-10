// A class representing a position in the game


public class Position {
    Entity[][] currentPlayingField;
    int length;
    int width;

    public Position(boolean[][] passable) {
        length = passable.length;
        width = passable[0].length;
        currentPlayingField = new Entity[length][width];
    }


    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public Entity[][] getCurrentPlayingField() {
        return this.currentPlayingField;
    }







}
