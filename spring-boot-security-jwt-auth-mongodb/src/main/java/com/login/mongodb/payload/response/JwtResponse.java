package com.login.mongodb.payload.response;

import java.util.List;

public class JwtResponse {
	private String token;
	private String type = "Bearer";
	private String id;
	private String userid;
	private String username;
	private List<String> roles;

	public JwtResponse(String accessToken, String id, String userid, String username, List<String> roles) {
		this.token = accessToken;
		this.id = id;
		this.userid = userid;
		this.username = username;
		this.roles = roles;
	}

	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	public void setTokenType(String tokenType) {
		this.type = tokenType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public String getuserid() {
		return userid;
	}

	public void setuserid(String userid) {
		this.userid = userid;
	}

	public List<String> getRoles() {
		return roles;
	}
}
