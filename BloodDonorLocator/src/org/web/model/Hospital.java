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
@Table(name= "hos_del")
public class Hospital {
		@Id
		@GeneratedValue(strategy =GenerationType.TABLE,generator ="autoHOS_id")
		@TableGenerator(name = "autoHOS_id",table ="HOS_id",
						pkColumnName="name",
						valueColumnName="value",
						allocationSize = 1)
		private long id;
		@OneToOne(cascade = CascadeType.ALL)
		private Address address;
		
		@Column(name="HOS_mobl",nullable=true,length=20)
		private long moblieno;
		
		@Column(name="HOS_loc",nullable=true, length=20)
		private String location;

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public long getMoblieno() {
			return moblieno;
		}

		public void setMoblieno(long moblieno) {
			this.moblieno = moblieno;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}
		
		
		
}
