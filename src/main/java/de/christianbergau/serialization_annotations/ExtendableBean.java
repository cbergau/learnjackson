package de.christianbergau.serialization_annotations;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.HashMap;
import java.util.Map;

public class ExtendableBean {
    private String name;
    private Map<String, String> props = new HashMap<String, String>();

    @JsonAnyGetter
    public Map<String, String> props() {
        return props;
    }

    public void prop(String key, String value) {
        props.put(key, value);
    }

    public void name(String name) {
        this.name = name;
    }
}
