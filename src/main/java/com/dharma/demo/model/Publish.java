package com.dharma.demo.model;

import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Date;

@Service
@Entity
@Table(name = "publish")
public class Publish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpublish;
    @Column
    private String username;
    @Column
    private String textname;
    @Column
    private String text;
    @Column
    private Date time;
    @Column(name = "class")
    private String classes;
    @Column
    private Integer clickrate;
    @Column
    private Integer commentnum;

    public Publish() {
    }

    public Publish(String textname, String text) {
        this.textname = textname;
        this.text = text;
    }

    public Publish(String username, String textname, String text, Date date, String classes, Integer clickrate, Integer commentnum) {
        this.username = username;
        this.textname = textname;
        this.text = text;
        this.time = date;
        this.classes = classes;
        this.clickrate = clickrate;
        this.commentnum = commentnum;
    }

    public Integer getIdpublish() {
        return idpublish;
    }

    public void setIdpublish(Integer idpublish) {
        this.idpublish = idpublish;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTextname() {
        return textname;
    }

    public void setTextname(String textname) {
        this.textname = textname;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return time;
    }

    public void setDate(Date date) {
        this.time = date;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Integer getClickrate() {
        return clickrate;
    }

    public void setClickrate(Integer clickrate) {
        this.clickrate = clickrate;
    }

    public Integer getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(Integer commentnum) {
        this.commentnum = commentnum;
    }
}
