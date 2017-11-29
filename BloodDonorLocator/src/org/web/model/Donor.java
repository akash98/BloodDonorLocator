package org.web.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "D_del")
public class Donor {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "autoD_id")
	@TableGenerator(name = "autoD_id", table = "d_id", pkColumnName = "name", valueColumnName = "value", allocationSize = 1)
	@Column(name = "D_id")
	private Long donorid;

	@Column(name = "D_dob", nullable=false, length=10)
	private String dateofbrith;

	@Column(name = "D_aid", unique = true,nullable= false, length = 20)
	private String aadhardid;

	@Column(name = "D_blg",nullable= false, length = 5 )
	private String bloodgroup;

	@Column(name = "D_gen",nullable= false, length = 10)
	private String gender;

	@Column(name = "D_age",nullable= false, length = 3)
	private String age;

	@Column(name = "D_weg",nullable= false, length = 10)
	private String weight;

	@Column(name = "D_drk",nullable= false, length = 10)
	private boolean drinks;

	@Column(name = "D_mbl",nullable= false, length = 20)
	private long moblieno;

	@Column(name = "D_usn",nullable= false, length = 20)
	private String username;

	@Column(name = "D_pas",nullable= false, length = 20)
	private String password;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "D_add", joinColumns = { @JoinColumn(name = "D_id")}, inverseJoinColumns = {@JoinColumn(name = "ADD_id")})            
	private Set<Address> donarAddress = new HashSet<Address>();

	public String getDateofbrith() {
		return dateofbrith;
	}

	public void setDateofbrith(String dateofbrith) {
		this.dateofbrith = dateofbrith;
	}

	public String getAadhardid() {
		return aadhardid;
	}

	public void setAadhardid(String aadhardid) {
		this.aadhardid = aadhardid;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Set<Address> getDonarAddress() {
		return donarAddress;
	}

	public void setDonarAddress(Set<Address> donarAddress) {
		this.donarAddress = donarAddress;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public boolean isDrinks() {
		return drinks;
	}

	public void setDrinks(boolean drinks) {
		this.drinks = drinks;
	}

	public long getMoblieno() {
		return moblieno;
	}

	public void setMoblieno(long moblieno) {
		this.moblieno = moblieno;
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
