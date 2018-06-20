package com.dharma.demo.service;

import com.dharma.demo.dao.JpaPublishDao;
import com.dharma.demo.dao.JpaPublishPageDao;
import com.dharma.demo.model.Publish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class PublishService {

    @Autowired
    private JpaPublishDao publishDao;
    @Autowired
    private JpaPublishPageDao jpaPublishPageDao;

    public Page<Publish> getPublishAll(org.springframework.data.domain.Pageable pageable){
        return jpaPublishPageDao.findAll(pageable);
    }
    public Page<Publish> getPublishByClasses(Pageable pageable,String classes){
        return jpaPublishPageDao.findByClasses(pageable,classes);
    }
    public Publish getPublishById(int id){return publishDao.findByIdpublish(id);}
    public List<Publish> getPublishs(){
        return (List<Publish>)publishDao.findAll();
    }
    public List<Publish> getByUsername(String name){
        return publishDao.findByUsername(name);
    }
    public List<Publish> getByClasses(String classes){
        return publishDao.findByClasses(classes);
    }
    public Page<Publish> getByNameLike(Pageable pageable,String name){
        return jpaPublishPageDao.findByTextnameIsLike(pageable,name);
    }
    @Transactional
    public void addPublished(Publish publish){
        publishDao.save(publish);
    }
    @Transactional
    public void delPublish(int id){
        publishDao.deleteByIdpublish(id);
    }
}
