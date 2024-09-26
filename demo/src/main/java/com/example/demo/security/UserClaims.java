package com.example.demo.security;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class UserClaims {

	private String sub;
	private String email;
	private String name;
	public UserClaims(String sub, String email, String name) throws InvalidKeyException, NoSuchPaddingException,
	InvalidAlgorithmParameterException,NoSuchAlgorithmException, BadPaddingException, IllegalBlockSizeException{
		this.sub = sub;
		this.email = email;
		this.name = name;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
