package com.dfmzone.unit;

import java.util.*;

public class Unit {

    private String type;
    private Map<String,Object> properties;
    private String  name;
    private int id;
    private List<Weapon> weapons;

    public Unit(int id) {
        this.id = id;
    }

    public void addProperty(String propertyName, Object propertyValue) {
        if (properties == null) {
            properties = new HashMap<>();
        }
        properties.put(propertyName, propertyValue);
    }

    public void addWeapon(Weapon weapon) {
        if(weapons == null) {
            weapons = new LinkedList<>();
        }
        weapons.add(weapon);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        if (name == null) {
            throw new RuntimeException("The variable name is not defined");
        }
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public Object getProperty(String propertyName) {
        if (properties == null) {
            throw new RuntimeException("No properties for this unit");
        }
        if(properties.get(propertyName) == null) {
            throw new RuntimeException("Property '" + propertyName + "' does not exist");
        }
        return properties.get(propertyName);
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        if (this.type == null) {
            throw new RuntimeException("The variable type is not defined");
        }
        return this.type;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
