package com.JsonReader.Indexer.Service;


import com.JsonReader.Indexer.DAO.FileDAO;
import com.JsonReader.Indexer.Model.FileData;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.logging.Logger;

@Service
public class FileService {

    @Autowired
    FileDAO fileDao;
    @Autowired
    RestTemplate restTemplate;

    public ResponseEntity<String> save() {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<FileData>> typeReference = new TypeReference<List<FileData>>(){};
        try {
            String dataFromBootstrap = restTemplate.getForObject("http://localhost:8081/data/get", String.class);
            System.out.println(dataFromBootstrap);
            List<FileData> data = mapper.readValue(dataFromBootstrap,typeReference);
            fileDao.saveAll(data);
            return new ResponseEntity<>("Success", HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }


}
