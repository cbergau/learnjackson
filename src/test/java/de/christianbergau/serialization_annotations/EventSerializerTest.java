package de.christianbergau.serialization_annotations;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EventSerializerTest {

    @Test
    void customDateSerializing() throws Throwable {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        String toParse = "20-12-2014 02:30:00";
        Date date = df.parse(toParse);

        Event event = new Event();
        event.eventDate = date;
        event.name = "Holiday";

        String result = new ObjectMapper().writeValueAsString(event);
        assertEquals("{\"name\":\"Holiday\",\"eventDate\":\"20-12-2014 02:30:00\"}", result);
    }
}
