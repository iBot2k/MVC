package model;

import java.util.ArrayList;

public class Product {
    private ArrayList <Tile> tiles;

    public Product(){
        this.tiles = new ArrayList<Tile>();
    }
    public void addTile(Tile tile){
        tiles.add(tile);
    }
    public int getCost(){
        int cost = 0;
        for (Tile tile:tiles) {
            cost += tile.getCost();
        }
        return cost;
    }
    public void changeTile(int numberOfSection, int newWeight, int newHeight, int newCost){
        Tile changedTile = tiles.get(numberOfSection);
        changedTile.setWeight(newWeight);
        changedTile.setHeight(newHeight);
        changedTile.setCost(newCost);
    }
    public ArrayList<Tile> getTiles() {
        return tiles;
    }

    public void setTiles(ArrayList<Tile> sections) {
        this.tiles = sections;
    }
}
