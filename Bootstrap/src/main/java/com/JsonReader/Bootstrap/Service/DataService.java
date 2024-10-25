package com.JsonReader.Bootstrap.Service;

import com.JsonReader.Bootstrap.DAO.DataDao;
import com.JsonReader.Bootstrap.Model.FileData;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {
    DataDao dataDao;
    public ResponseEntity<List<FileData>> getAllData() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<FileData>> typeReference = new TypeReference<List<FileData>>(){};
            InputStream inputStream = TypeReference.class.getResourceAsStream("/static/Data.json");
                List<FileData> data = mapper.readValue(inputStream,typeReference);
            return new ResponseEntity<>(data, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

}
