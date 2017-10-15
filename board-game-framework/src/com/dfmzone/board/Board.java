package com.dfmzone.board;

import com.dfmzone.unit.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Board {

    private int height;
    private int width;
    private List tiles;
//    private static final Logger LOGGER = Logger.getLogger(Board.class.getName());

    public Board(int width, int height) {
        this.height = height;
        this.width = width;
        initialize();
//        LOGGER.log(Level.INFO, "Board (" + width + "," + height + ") created");
    }

    private void initialize() {
        tiles = new ArrayList(width);
        for (int i = 0; i < width; i++) {
            tiles.add(i, new ArrayList(height));
            for (int j = 0; j < height; j++) {
                ((ArrayList) tiles.get(i)).add(j, new Tile());
            }
        }
    }

    public List getTiles() {
        return tiles;
    }

    // Get a specific tile in the tiles list
    public Tile getTile(int x, int y) {
        return (Tile) ((ArrayList) tiles.get(x - 1)).get(y - 1);
    }

    public void addUnit(int x, int y, Unit unit) {
        Tile tile = getTile(x, y);
        tile.addUnit(unit);
    }

    public void removeUnit(int x, int y, Unit unit) {
        Tile tile = getTile(x, y);
        tile.removeUnit(unit);
        System.out.println(" **** Unit at " + "(" + x + "," + y + ")" + " removed **** ");
    }

    public void removeUnits(int x, int y) {
        Tile tile = getTile(x, y);
        tile.removeUnits();
        System.out.println(" **** All units from " + "(" + x + "," + y + ")" + " removed **** " );
    }

    public List getUnits(int x, int y) {
        Tile tile = getTile(x, y);
        return tile.getUnitList();
    }
}
