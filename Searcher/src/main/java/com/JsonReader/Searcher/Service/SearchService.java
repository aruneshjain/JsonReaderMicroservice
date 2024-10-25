package com.JsonReader.Searcher.Service;

import com.JsonReader.Searcher.DAO.SearchDAO;
import com.JsonReader.Searcher.Model.FileData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SearchService {

    @Autowired
    SearchDAO searchDao;

    public ResponseEntity<List<FileData>> getAllData() {
        try {
            return new ResponseEntity<>(searchDao.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Optional<FileData>> getData(String id) {
        try {
            return new ResponseEntity<>(searchDao.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }

}
