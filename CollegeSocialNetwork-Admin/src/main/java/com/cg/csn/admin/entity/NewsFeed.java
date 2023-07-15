package com.cg.csn.admin.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "news_feed")
public class NewsFeed
{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "news_id")
private Long id;

private String title;

private String content;

private byte[] imageData;

@Column(name = "posted_date")
private Date postedDate;

@Column(name = "student_id")
private Long studentId;

@Column(name = "student_name")
private String studentName;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

public byte[] getImageData() {
	return imageData;
}

public void setImageData(byte[] imageData) {
	this.imageData = imageData;
}

public Date getPostedDate() {
	return postedDate;
}

public void setPostedDate(Date postedDate) {
	this.postedDate = postedDate;
}

public Long getStudentId() {
	return studentId;
}

public void setStudentId(Long studentId) {
	this.studentId = studentId;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

}

//package com.cg.boot.entity;
//
//import java.util.Date;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class NewsFeed {
//
//@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
//private Long newsId;
//
//private String title;
//
//private String content;
//
//private Date postedDate;
//
//private Long studentId;
//
//private String studentName;
//
//public Long getNewsId() {
//    return newsId;
//}
//
//public void setNewsId(Long newsId) {
//    this.newsId = newsId;
//}
//
//public String getTitle() {
//    return title;
//}
//
//public void setTitle(String title) {
//    this.title = title;
//}
//
//public String getContent() {
//    return content;
//}
//
//public void setContent(String content) {
//    this.content = content;
//}
//
//public Date getPostedDate() {
//    return postedDate;
//}
//
//public void setPostedDate(Date postedDate) {
//    this.postedDate = postedDate;
//}
//
//public Long getStudentId() {
//    return studentId;
//}
//
//public void setStudentId(Long studentId) {
//    this.studentId = studentId;
//}
//
//public String getStudentName() {
//    return studentName;
//}
//
//public void setStudentName(String studentName) {
//    this.studentName = studentName;
//}
//
//}
