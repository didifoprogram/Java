package com.dfmzone.board;

import com.dfmzone.unit.Unit;

import java.util.LinkedList;
import java.util.List;

public class Tile {

    private List<Unit> unitList = new LinkedList<>();

    public Tile() {
    }

    void addUnit(Unit unit) {
        unitList.add(unit);
    }

    List<Unit> getUnitList() {
        return unitList;
    }

    void removeUnit(Unit unit) {
        unitList.remove(unit);
    }

    void removeUnits() {
        unitList.clear();
    }
}
