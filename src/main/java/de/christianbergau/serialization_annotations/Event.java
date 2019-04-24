package de.christianbergau.serialization_annotations;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import de.christianbergau.serialization_annotations.serializer.CustomDateSerializer;

import java.util.Date;

public class Event {
    public String name;

    @JsonSerialize(using = CustomDateSerializer.class)
    public Date eventDate;
}
