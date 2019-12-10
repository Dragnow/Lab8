class Tower extends Entity{
    int damage;
    int range;

    //todo position[2] //0 = row, 1 = col

    Tower() {
        damage =1;      //base damage
        range = 1;      //base range
    }

    /*void tower(int newDamage) {
        damage =newDamage;

    }*/

    int getDamage() {
        return damage;
    }

    int getRange() {
        return range;
    }

    //todo check for


}
