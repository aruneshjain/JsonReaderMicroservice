package com.JsonReader.Searcher.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class FileData {
    @Id
    private String id;
    private String name;
    private String language;
    @Column(length = 8000)
    private String bio;
    private String version;
}