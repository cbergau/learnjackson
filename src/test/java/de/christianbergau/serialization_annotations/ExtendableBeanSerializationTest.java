package de.christianbergau.serialization_annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtendableBeanSerializationTest {

    @Test
    void whenSerializingUsingJsonAnyGetter_thenCorrect() throws JsonProcessingException {
        ExtendableBean bean = new ExtendableBean();
        bean.name("My Bean");
        bean.prop("KeyA", "ValueA");
        bean.prop("KeyB", "ValueB");

        String result = new ObjectMapper().writeValueAsString(bean);

        assertEquals("{\"KeyB\":\"ValueB\",\"KeyA\":\"ValueA\"}", result);
    }
}
