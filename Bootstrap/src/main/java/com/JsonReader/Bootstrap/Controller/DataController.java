package com.JsonReader.Bootstrap.Controller;

import com.JsonReader.Bootstrap.Model.FileData;
import com.JsonReader.Bootstrap.Service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("data")
public class DataController {
    @Autowired
    DataService dataService;

    @GetMapping("get")
    public ResponseEntity<List<FileData>> getAllData(){
        return dataService.getAllData();
    }
}
