package model;

public class Sidewalk extends Product implements Costed {
        private int sidewalkCost=500;

    @Override
    public int getCost() {
        return super.getCost()+sidewalkCost;
    }

    public int getSidewalkCost() {
        return sidewalkCost;
    }

    public void setSidewalkCost(int sidewalkCost) {
        this.sidewalkCost = sidewalkCost;
    }
}
