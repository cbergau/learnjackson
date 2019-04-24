package de.christianbergau.serialization_annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleBeanTest {

    @Test
    void simple() throws JsonProcessingException {
        SimpleBean bean = new SimpleBean();
        bean.id = 1;
        bean.name = "Chris";
        bean.salary = 2000.99;

        String result = new ObjectMapper().writeValueAsString(bean);

        assertEquals("{\"id\":1,\"name\":\"Chris\",\"salary\":2000.99}", result);
    }
}
