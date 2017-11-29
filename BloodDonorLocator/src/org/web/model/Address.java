package org.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "ADD_del")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "autoADD_id")
	@TableGenerator(name = "autoADD_id", table = "ADD_id", pkColumnName = "name", valueColumnName = "value", allocationSize = 1)
	@Column(name = "ADD_id")
	private long id;

	@Column(name = "ADD_cot", nullable = false, length = 20)
	private String country;

	@Column(name = "ADD_cty", nullable = false, length = 20)
	private String city;

	@Column(name = "ADD_zip", nullable = false, length = 20)
	private String zip;

	@Column(name = "ADD_sta", nullable = false, length = 20)
	private String state;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
