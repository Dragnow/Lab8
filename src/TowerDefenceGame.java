public class TowerDefenceGame {
    int roundsTotal;
    Position position;
    boolean[][] passable;
    TowerDefenceLevel level;
    // ev int monstersMax;
    //ev int towersMax;

    public TowerDefenceGame(boolean[][] passable, TowerDefenceLevel level) {
        this.roundsTotal = 0;
        this.position = new Position(passable);
        this.passable = passable;
        this.level = level;
    }


    //game

    void playRound() {
        //todo

        for(int i = 0; i < position.getLength() ; i++) {                             //loop thought position
            for(int j = 0; j < position.getWidth() ; j++) {
                if (null != position.getCurrentPlayingField()[i][j]) {                //if Entity is found, do its action
                    System.out.print("Entity found");
                    //todo, do something
                    //check if its a tower or monster (maybe check array:en passable)

                }
            }
        }

        //continue loop to end of position

        //check for victory //todo
        //newEnemy();     //todo move to gui or some other place, or add spawning conditions
        System.out.print(position.getCurrentPlayingField()[level.startRow][level.getStartCol()]);
        addRound(1);
    }

    //adds one to roundsTotal
    void addRound(int number) {
        roundsTotal += number;
    }

    public Position getPosition() {
        return position;
    }

    //todo boolean isGameOver()
    //check for monster on position[int targetRow][int targetCol]
    //return true or false

    //monster
    void newEnemy() {
        //todo
        position.getCurrentPlayingField()[level.getStartRow()][level.getStartCol()] = new Enemy(3);

        //get starting position
        //create enemy at position
    }

    //todo void newEnemy(health)
    //check position[int startRow][int startCol] to know if it can spawn a monster
    //or

    //todo getPositionOfMonster

    //todo moveMonster , check if potion is ok, true move monster, false check fore a new direction

    //todo damageMonster
    //50% chanse to damage
    //  -todo isDead



    //tower
    //todo new tower

    public static void main(String[] args) {

    }

}