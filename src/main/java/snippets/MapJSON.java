package snippets;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;

public class MapJSON {
    /**
     * Map an object into JSON String representation
     * Map JSON to HashMap
     */
    public static void emptyMethod() throws JsonProcessingException {


        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String humanJSON = mapper.writeValueAsString(null); // null shall be an Object to map
        HashMap result = new ObjectMapper().readValue(humanJSON, HashMap.class);


    }
}
