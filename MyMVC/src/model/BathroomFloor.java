package model;

public class BathroomFloor extends Product implements Costed {
        private int bathroomCost=300;

    @Override
    public int getCost() {
        return super.getCost()+bathroomCost;
    }
    public int getBathroomCost(){
        return bathroomCost;
    }

    public void setBathroomCost(int bathroomCost) {
        this.bathroomCost = bathroomCost;
    }
}
