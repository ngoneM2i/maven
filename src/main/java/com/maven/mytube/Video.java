package com.maven.mytube;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="video")
public class Video {
	
	@Id	 
	@GeneratedValue(strategy=GenerationType.IDENTITY) // pour le Auto Increment de MySQL
	@Column(name="id")
	private Integer id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="author")
	private User author;
	
	@Column(name="source")
	private String source;
	
	@Column(name="datePub")
	private Date datePub;
	
	@Column(name="comment")
	private String comment;
	
	@Column(name="description")
	private String description;
	
	@Column(name="nbVues")
	private Integer nbVues;
	
	@Column(name="nbLikes")
	private Integer nbLikes;
	
	@Column(name="nbDislikes")
	private Integer nbDisLikes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getDatePub() {
		return datePub;
	}

	public void setDatePub(Date datePub) {
		this.datePub = datePub;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getNbVues() {
		return nbVues;
	}

	public void setNbVues(Integer nbVues) {
		this.nbVues = nbVues;
	}

	public Integer getNbLikes() {
		return nbLikes;
	}

	public void setNbLikes(Integer nbLikes) {
		this.nbLikes = nbLikes;
	}

	public Integer getNbDisLikes() {
		return nbDisLikes;
	}

	public void setNbDisLikes(Integer nbDisLikes) {
		this.nbDisLikes = nbDisLikes;
	}
	
	@Override
	public String toString() {
		return "[id: " + id + " " + "title: " + title + "]";
	}
	

		
}

