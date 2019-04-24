package de.christianbergau.serialization_annotations;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.HashMap;
import java.util.Map;

@JsonRootName(value = "MyRootName")
@JsonPropertyOrder({"id", "name"})
public class ExtendableBean {
    private String name;
    private int id;

    private Map<String, String> props = new HashMap<String, String>();

    public ExtendableBean(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @JsonAnyGetter
    public Map<String, String> props() {
        return props;
    }

    public void prop(String key, String value) {
        props.put(key, value);
    }

    @JsonGetter("name")
    public String name() {
        return name;
    }

    @JsonGetter("id")
    public int id() {
        return id;
    }
}
