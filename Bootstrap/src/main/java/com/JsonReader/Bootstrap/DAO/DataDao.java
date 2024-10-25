package com.JsonReader.Bootstrap.DAO;

import com.JsonReader.Bootstrap.Model.FileData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataDao extends JpaRepository<FileData,String> {
}
