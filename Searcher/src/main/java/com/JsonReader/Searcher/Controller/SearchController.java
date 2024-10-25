package com.JsonReader.Searcher.Controller;

import com.JsonReader.Searcher.Model.FileData;
import com.JsonReader.Searcher.Service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Search")
public class SearchController {

    @Autowired
    SearchService searchService;

    @GetMapping("get")
    public ResponseEntity<List<FileData>> getAllData(){
        return searchService.getAllData();
    }
    @GetMapping("get/{id}")
    public ResponseEntity<Optional<FileData>> getData(@PathVariable String id){
        return searchService.getData(id);
    }


}
