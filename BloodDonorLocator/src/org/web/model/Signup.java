package org.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="Sig_Del")
public class Signup {
	
	@Id
	@GeneratedValue(strategy =GenerationType.TABLE,generator ="autoSig_id")
	@TableGenerator(name = "autoSig_id",table ="Sig_id",
						pkColumnName="name",
						valueColumnName="value",
						allocationSize = 1)
	@Column(name="Sig_id")
	private Long SigId;
	
	@Column(name="Sig_usn")
	private String username;
	
	@Column(name="Sig_pas")
	private String password;
	
	@Column(name="Sig_mob")
	private int moblieno;
	
	@Column(name="Sig_mal",unique=true)
	private String email;
	
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
