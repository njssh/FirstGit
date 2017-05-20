package com.njs.demo.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	private String userId;  
    private String userName;  
    private String age;  
    private String passWord;
      
    public User() {};  
      
    public User(String userId, String userName, String age) {  
        this.userId = userId;  
        this.userName = userName;  
        this.age = age;  
    }  
    public String getUserId() {  
        return userId;  
    }  
    public void setUserId(String userId) {  
        this.userId = userId;  
    }  
    public String getUserName() {  
        return userName;  
    }  
    public void setUserName(String userName) {  
        this.userName = userName;  
    }  
    public String getAge() {  
        return age;  
    }  
    public void setAge(String age) {  
        this.age = age;  
    }
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}  
    
}
