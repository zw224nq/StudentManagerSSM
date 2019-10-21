package com.ischoolbar.programmer.entity;

import java.sql.Date;

import org.springframework.stereotype.Component;

/**
 * �û�ʵ����
 * @author llq
 *
 */
@Component
public class User {
	private Long id;//�û�id����������
	private String username;//�û���
	private String password;//����
	//private String  age;
	private Integer age;
	private Date padate;
	public Date getPadate() {
		return padate;
	}
	public void setPadate(Date padate) {
		this.padate = padate;
	}
	
	
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
