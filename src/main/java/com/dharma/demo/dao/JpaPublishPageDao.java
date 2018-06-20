package com.dharma.demo.dao;

import com.dharma.demo.model.Publish;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaPublishPageDao extends JpaRepository<Publish,String> {
    Page<Publish> findAll(Pageable pageable);
    Page<Publish> findByClasses(Pageable pageable,String classes);
    Page<Publish> findByTextnameIsLike(Pageable pageable,String name);
}
