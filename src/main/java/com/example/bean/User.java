package com.example.bean;

public class User {
	private int userId;
    private String username;
	private String password;
    private String email;
    private int identification_no;
    public User()
    {
 	   
    }
 	
 	public User(int userId, String username, String password, String email, int identification_no) {
 	super();
 	this.userId = userId;
 	this.username = username;
 	this.password = password;
 	this.email = email;
 	this.identification_no = identification_no;
    }
   public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdentification_no() {
		return identification_no;
	}
	public void setIdentification_no(int identification_no) {
		this.identification_no = identification_no;
	}

	@Override
	public String toString() {
		return "User [userid=" + userId + ", username=" + username + ", password=" + password + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userid) {
		this.userId = userid;
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
