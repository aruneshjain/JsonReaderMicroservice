package com.JsonReader.Searcher.DAO;

import com.JsonReader.Searcher.Model.FileData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchDAO extends JpaRepository<FileData,String> {
}
