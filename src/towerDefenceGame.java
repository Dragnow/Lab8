
public class TowerDefenceGame {
    int roundsTotal;
    Position playingfield;
    // ev int monstersMax;
    //ev int towersMax;

    void towerDefenceGame(boolean[][] passable){
        Position playingfield = new Position(passable);
    }


    //game

    void playRound() {
        //todo

        for(int i = 0;i < playingfield.getPlayingField().length ;i++) {         //loop thought position
            for(int j = 0;j < playingfield.getPlayingField()[0].length ;j++) {
                if (null != playingfield.getPlayingField()[i][j]) {             //if Entity is found, do its action
                    //todo, do something
                    //check if its a tower or monster (maybe check array:en passable)

                }
            }
        }

        //continue loop to end of position

        nextRound();
    }

    //adds one to roundsTotal
    void nextRound() {
        roundsTotal += 1;
    }


    //todo boolean isGameOver()
    //check for monster on position[int targetRow][int targetCol]
    //return true or false

    //monster
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