class Tower extends Entity{
    int damage;
    int range;

    //todo position[2] //0 = row, 1 = col

    public Tower(int dmg, int rg) {
        this.damage = dmg = 1;       //base damage
        this.range = rg;             //base range
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
