package org.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users_tbl")
public class Users {
	@Id
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "code")
	private String code;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean checkPassword(String password2, String passwordDB) {
		// TODO Auto-generated method stub
		return false;
	}

}
