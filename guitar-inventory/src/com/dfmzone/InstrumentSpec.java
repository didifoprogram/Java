package com.dfmzone;

import java.util.HashMap;
import java.util.Map;

public class InstrumentSpec {

    private Map<String, Object> properties = new HashMap<>();

    public InstrumentSpec(Map<String, Object> properties) {
        this.properties = properties;
    }

    public Object getProperty(String propertyName) {
        return properties.get(propertyName);
    }

    public Map<String, Object> getProperties() {
        return new HashMap<>(properties);
    }

    @Override
    public String toString() {
        return "InstrumentSpec{" +
                "properties=" + properties +
                '}';
    }
}
