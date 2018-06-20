package com.dharma.demo.dao;

import com.dharma.demo.model.Publish;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPublishPageDao extends JpaRepository<Publish,String> {
    Page<Publish> findAll(Pageable pageable);
    Page<Publish> findByClasses(Pageable pageable,String classes);
}
