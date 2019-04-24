package de.christianbergau.serialization_annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtendableBeanSerializationTest {

    @Test
    void whenSerializingUsingJsonAnyGetter_thenCorrect() throws JsonProcessingException {
        ExtendableBean bean = new ExtendableBean("My Bean", 1);
        bean.prop("KeyA", "ValueA");
        bean.prop("KeyB", "ValueB");

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        String result = objectMapper.writeValueAsString(bean);

        assertEquals("{\"MyRootName\":{\"id\":1,\"name\":\"My Bean\",\"KeyB\":\"ValueB\",\"KeyA\":\"ValueA\"}}", result);
    }
}
