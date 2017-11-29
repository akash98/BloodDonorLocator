package org.web.model;

public class Administrator {
	private String id;
	public String  name;
	private String aadhardid;
	private String Address;
	private int moblieno;
	private String email;
	private String username;
	private String password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadhardid() {
		return aadhardid;
	}
	public void setAadhardid(String aadhardid) {
		this.aadhardid = aadhardid;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getMoblieno() {
		return moblieno;
	}
	public void setMoblieno(int moblieno) {
		this.moblieno = moblieno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
