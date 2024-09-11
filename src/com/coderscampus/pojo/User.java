package com.coderscampus.pojo;

public class User {
	private String username;
	private String password;
	private String name;

	public static void main(String[] arg) {
		User userInput = new User("CodersIn ", "Password123 ", "Marcus" );
		
		System.out.println(userInput.getUserInfo());
	}
	
	
	public User(String username, String password, String name) {
		this.username = username;
		this.password = password;
		this.name = name;
	}
	
	public String getUserInfo() {
		return "Username: " + username + "Password: " + password + "Name: " + name;
	}
}
