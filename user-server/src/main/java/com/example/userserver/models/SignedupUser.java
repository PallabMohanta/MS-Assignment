package com.example.userserver.models;

public class SignedupUser {
	
	private Long uid;
	private String upwd;
	
	public SignedupUser() {}
	
	public SignedupUser(Long uid, String upwd) {
		this.uid = uid;
		this.upwd = upwd;
	}
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	@Override
	public String toString() {
		return "SignedupUser [uid=" + uid + ", upwd=" + upwd + "]";
	}
	
}
