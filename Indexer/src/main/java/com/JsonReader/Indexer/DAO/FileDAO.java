package com.JsonReader.Indexer.DAO;


import com.JsonReader.Indexer.Model.FileData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FileDAO extends JpaRepository<FileData,String> {
}
