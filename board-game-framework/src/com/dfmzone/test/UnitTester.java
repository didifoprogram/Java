package com.dfmzone.test;

import com.dfmzone.unit.Unit;
import com.dfmzone.unit.UnitGroup;
import com.dfmzone.unit.Weapon;

import java.util.List;

public class UnitTester {

    public void testType(String input, String output, Unit unit) {
        unit.setType(input);
        System.out.println("Testing type property...");
        if (unit.getType().equals(output)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed " + input + " not equals " + output);
        }
    }

    public void testSpecificProperty(Object expectedInput, Object expectedOutput, Unit unit, String propertyName) {
        System.out.println("Testing setting/getting a specific property");
        unit.addProperty(propertyName, expectedInput);
        Object output = unit.getProperty(propertyName);
        if (expectedOutput.equals(output)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed " + output + " not equals " + expectedOutput);
        }
    }

    public void changePropertyValue(String propertyName, Object expectedInput,Object expectedOutput, Unit unit) {
        unit.getProperties().put(propertyName, expectedInput);
        Object output = unit.getProperty(propertyName);
        System.out.println("Trying to change property value...");
        if (output.equals(expectedOutput)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed " + output + " not equals " + expectedOutput);
        }
    }

    public void testNonExistentProperty(String propertyName, Unit unit) {
        System.out.println("Testing non existent property...");
        try {
            unit.getProperty(propertyName);
        } catch (RuntimeException e) {
            System.out.println("Test passed");
            return;
        }
        System.out.println("Test failed");
    }

    public void testId(int expectedOutput, Unit unit) {
        int output = unit.getId();
        System.out.println("Getting id...");
        if (output == expectedOutput) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed expected output " + expectedOutput + " is not equals " + output);
        }
    }

    public void testName(String expectedOutput, Unit unit) {
        String output = unit.getName();
        System.out.println("Getting name...");
        if (expectedOutput.equals(output)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed, output" + output + "is not equals to the expected output " + expectedOutput);
        }
    }

    public void testWeapons(Weapon weapon, Unit unit) {
        System.out.println("Testing weapons collection...");
        unit.addWeapon(weapon);
        for (Weapon w : unit.getWeapons()) {
            if (w.equals(weapon)) {
                System.out.println("Test passed");
                return;
            }
        }
        System.out.println("Test failed " + "no weapon" + weapon.getType() + " found");
    }

    public void testSettingGettingUnitGroup(List<Unit> unitList) {
        UnitGroup unitGroup = new UnitGroup(unitList);
        System.out.println("Testing Setting/Getting unit group...");
        if (unitGroup.getUnits().equals(unitList)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed, unit lists not equal");
        }
    }

    public void testAddUnitToUnitGroup(Unit unit, UnitGroup unitGroup) {
        System.out.println("Testing adding unit to unit group...");
        unitGroup.addUnit(unit);
        if (unitGroup.getUnitById(unit.getId()).equals(unit)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void testGetUnitById(int id, UnitGroup unitGroup) {
        System.out.println("Testing getting unit by ID");
        if (unitGroup.getUnitById(id).getId() == id) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void testRemoveUnitById(int id, UnitGroup unitGroup) {
        unitGroup.removeUnit(id);
        System.out.println("Testing remove unit by id...");
        if (unitGroup.getUnitById(id) == null) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed, unit not removed");
        }
    }

    public void testRemoveUnitByInstance(Unit unit, UnitGroup  unitGroup) {
        unitGroup.removeUnit(unit);
        System.out.println("Testing remove unit by instance...");
        if(unitGroup.getUnitById(unit.getId()) == null) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed, unit not removed");
        }
    }



}
