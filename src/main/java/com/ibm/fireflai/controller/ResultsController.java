package com.ibm.fireflai.controller;


import java.io.IOException;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.fireflai.db.DBConnect;

@RestController
@RequestMapping("/api/results")
public class ResultsController {
    Logger logger = LoggerFactory.getLogger(ResultsController.class);
    
    private DBConnect db = new DBConnect();
    private final static String dbName = "fireflaidb-results";
    
    @PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> addDocument(@RequestBody Object document) {
        
        return db.addDocument(document, dbName);
    }
    
    @DeleteMapping(path = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> deleteDocument(@RequestBody Object document) {
        return db.deleteDocument(document, dbName);
    }

    public Object getDocument(String idDoc) throws IOException {
        return db.getDocument(idDoc, dbName);
    }

    @GetMapping("/getall")
    public List<Object> getAllDocuments() throws IOException {
        return db.getAllDocuments(dbName);
    }  
    
}
