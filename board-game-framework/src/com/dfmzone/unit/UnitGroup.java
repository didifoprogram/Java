package com.dfmzone.unit;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UnitGroup {

    private Map<Integer, Unit> units;

    public UnitGroup() {
        this(new LinkedList<>());
    }

    public UnitGroup(List<Unit> unitList) {
        units = new HashMap<>();
        for (Unit u : unitList) {
            units.put(u.getId(), u);
        }
    }

    public void addUnit(Unit unit) {
        units.put(unit.getId(), unit);
    }

    public void removeUnit(int unitId) {
        units.remove(unitId);
    }

    public void removeUnit(Unit unit) {
        units.remove(unit.getId());
    }

    public Unit getUnitById(int id) {
        return units.get(id);
    }

    public List<Unit> getUnits() {
        List<Unit> unitList = new LinkedList<>();
        units.forEach((k,v) -> unitList.add(v));
        return unitList;
    }
}
