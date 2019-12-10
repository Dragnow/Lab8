import java.util.Random;

class Enemy extends Entity{
    int health;
    String previousPosition; //(left, right, up, down)


    //constructor - constructs Enemy
    public Enemy() {

        this.setHealth(3); //base health
    }

    int getHealth() {
        return health;
    }

    void setHealth(int damage) {
        health -= damage;
    }

    public int randomValue(int value){
        Random newRandom = new Random();
        return newRandom.nextInt(value);
    }

    public String getPreviousPosition() {
        return previousPosition;
    }

    public void setPreviousPosition(String previousPosition) {
        this.previousPosition = previousPosition;
    }

    String direction() {
        String output = "";
        String[] directions = new String[]{"left", "right", "up", "down"};

        do {
            output = directions[randomValue(4)];
        } while (this.getPreviousPosition() == output);

        this.setPreviousPosition(output);

        return output;
        }

    //todo monster mover (choose random direction != previousPosition)
    //follow left wall or other logic
    //todo left
    //todo right
    //todo upp
    //todo down



}
