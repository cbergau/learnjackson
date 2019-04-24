package de.christianbergau.serialization_annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RawBeanSerializationTest {

    @Test
    void rawSerialization() throws JsonProcessingException {
        RawBean bean = new RawBean();
        bean.json = "{1, 2, 3}";
        bean.name = "abc";

        String result = new ObjectMapper().writeValueAsString(bean);

        assertEquals("{\"name\":\"abc\",\"json\":{1, 2, 3}}", result);
    }
}
