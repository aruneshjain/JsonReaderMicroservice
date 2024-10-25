package com.JsonReader.Indexer.Controller;


import com.JsonReader.Indexer.Model.FileData;
import com.JsonReader.Indexer.Service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("data")
public class FileController {
    @Autowired
    FileService fileService;

    @PostMapping("add")
    public ResponseEntity<String> save(){
        return fileService.save();
    }
}
