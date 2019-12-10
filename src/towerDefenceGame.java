public class TowerDefenceGame {
    int roundsTotal;
    Position postion;
    boolean[][] passable;
    TowerDefenceLevel level;
    // ev int monstersMax;
    //ev int towersMax;

    public TowerDefenceGame(boolean[][] passable, TowerDefenceLevel level) {
        this.roundsTotal = 0;
        this.postion = new Position(passable);
        this.passable = passable;
        this.level = level;
    }


    //game

    void playRound() {
        //todo

        for(int i = 0;i < postion.getLength() ;i++) {         //loop thought position
            for(int j = 0;j < postion.getWidth() ;j++) {
                if (null != postion.getCurrentPlayingField()[i][j]) {             //if Entity is found, do its action
                    System.out.print("found an entity here");
                    //todo, do something
                    //check if its a tower or monster (maybe check array:en passable)

                }
            }
        }

        //continue loop to end of position

        //check for victory //todo
        newEnemy();
        System.out.print(postion.getCurrentPlayingField()[level.startRow][level.getStartCol()]);
        addRound(1);
    }

    //adds one to roundsTotal
    void addRound(int number) {
        roundsTotal += number;
    }

    public Position getPostion() {
        return postion;
    }

    //todo boolean isGameOver()
    //check for monster on position[int targetRow][int targetCol]
    //return true or false

    //monster
    void newEnemy() {
        //todo
        postion.getCurrentPlayingField()[level.startRow][level.getStartCol()] = new Enemy();

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



}