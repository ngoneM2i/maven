package com.maven.mytube;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="comment")
public class Comment {
	

	@Id	 
	@GeneratedValue(strategy=GenerationType.IDENTITY) // pour le Auto Increment de MySQL
	@Column(name="comment_id")
	private Integer id;
	
	@Column(name="user_id")
	private User surfer;
	
	@Column(name="content")
	private	String content;
	
	@ManyToOne
	@JoinColumn(name="video_id",
				foreignKey=@ForeignKey(name ="fk_video_comment"))
	private Video video;

	
	public Comment() {
	}

	public Comment(Integer id, User surfer, String content) {
		
		this.id = id;
		surfer = new User();
		this.content = content;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getSurfer() {
		return surfer;
	}

	public void setSurfer(User surfer) {
		this.surfer = surfer;
	}

	public String getComment() {
		return content;
	}

	public void setComment(String comment) {
		this.content = comment;
	}
	
	@Override
	public String toString() {
		return "[id: " + surfer.getId() + ", surfer.getUsername(): " + surfer.getUsername() +
				", surfer.getPassword(): "  + surfer.getPassword() +  ", surfer.getEmail(): "  + surfer.getEmail() + 
				", content: " + content + "]";
	}
	
	
}