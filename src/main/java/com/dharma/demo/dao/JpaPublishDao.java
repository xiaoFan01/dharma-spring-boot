package com.dharma.demo.dao;

import com.dharma.demo.model.Publish;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JpaPublishDao extends CrudRepository<Publish,String>{
    List<Publish> findByUsername(String name);
    List<Publish> findByClasses(String classes);
    Publish findByIdpublish(int id);
    void deleteByIdpublish(int id);
}
