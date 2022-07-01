package org.vedatdemirdev.services;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JsonService {

    JSONParser jsonParser = new JSONParser();

    //This method reads json file and returns array that include json objects
    public JSONArray readAndGet(String fileName){
        try (FileReader reader = new FileReader(fileName)){


            Object object = jsonParser.parse(reader);

            return (JSONArray) object;

        } catch (ParseException | IOException e) {
            throw new RuntimeException(e);
        }
    }

}
