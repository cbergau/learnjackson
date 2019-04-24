package de.christianbergau.serialization_annotations;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeanWithCreatorTest {

    @Test
    void testDeserialize() throws IOException {
        String json = "{\"id\":1,\"theName\":\"My bean\"}";

        BeanWithCreator bean = new ObjectMapper()
                .readerFor(BeanWithCreator.class)
                .readValue(json);

        assertEquals("My bean", bean.name);
    }
}
