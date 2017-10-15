package com.dfmzone;

import com.dfmzone.board.Board;
import com.dfmzone.test.UnitTester;
import com.dfmzone.unit.Unit;
import com.dfmzone.unit.UnitGroup;
import com.dfmzone.unit.Weapon;

import java.util.LinkedList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        UnitTester unitTester = new UnitTester();
        Board board = new Board(3, 4);
        Unit soldier = new Unit(1);
        soldier.setName("Rock");
        soldier.addProperty("name", "02");
        soldier.addProperty("color", "blue");
        soldier.addProperty("race", "elf");

        unitTester.testType("Soldier", "Soldier", soldier);
        unitTester.changePropertyValue("name", "rick", "rick", soldier);
        unitTester.testNonExistentProperty("armor", soldier);
        unitTester.testWeapons(new Weapon("Gun"), soldier);
//        System.out.println(soldier.getProperty("armor"));

        List<Unit> unitList = new LinkedList<>();
        unitList.add(new Unit(1));
        unitList.add(new Unit(2));

        UnitGroup unitGroup = new UnitGroup(unitList);

        unitTester.testSettingGettingUnitGroup(unitList);
        unitTester.testAddUnitToUnitGroup(soldier, unitGroup);
        unitTester.testGetUnitById(2, unitGroup);
        unitTester.testRemoveUnitById(1, unitGroup);
        unitTester.testRemoveUnitByInstance(new Unit(1), unitGroup);

        board.addUnit(2, 3, soldier);

        board.addUnit(1, 2, new Unit(2));

//        System.out.println(board.getUnits(1, 2));
//        System.out.println(board.getUnits(2, 3));
    }
}
