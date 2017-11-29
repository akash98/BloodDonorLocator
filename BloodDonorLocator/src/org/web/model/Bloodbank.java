package org.web.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;



@Entity
@Table(name="BDL_del")
public class Bloodbank  {
	
	@Id
	@GeneratedValue(strategy =GenerationType.TABLE,generator ="autoBDL_id")
	@TableGenerator(name = "autoBDL_id",table ="BDL_id",
						pkColumnName="name",
						valueColumnName="value",
						allocationSize = 1)
	
	@Column(name="BDL_id",nullable=false,length=20)
	private long  id;
	
	@Column(name="BDL_loc",nullable=false,length=20)
	private String location;
	
	@Column(name="BDL_mbl",nullable=false,length=20)
	private long moblieno;
	
	@OneToOne(cascade = CascadeType.ALL)
	//@JoinTable(name = "BDL_add", joinColumns = { @JoinColumn(name = "BDL_id")}, inverseJoinColumns = {@JoinColumn(name = "ADD_id")})   	private Address address;
	private Address address;

	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getMoblieno() {
		return moblieno;
	}
	public void setMoblieno(long moblieno) {
		this.moblieno = moblieno;
	}
	//public Address getAddress() {
	//	return address;
	//}
	///public void setAddress(Address address) {
	///	this.address = address;
	//}
	
	

}
