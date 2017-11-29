package org.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="Nof_Del")
public class Notification {
	@Id
	@GeneratedValue(strategy =GenerationType.TABLE,generator ="autoNof_id")
	@TableGenerator(name = "autoNof_id",table ="Nof_id",
						pkColumnName="name",
						valueColumnName="value",
						allocationSize = 100)
	
	@Column(name="Nof_sid")
	private long  send_id;
	
	@Column(name="Nof_rid")
	private long  rece_id;
	
	@Column(name="Nof_Sta")
	public String status;
	
	@Column(name="Nof_blr")
	public String bloodreq;
	
	
	public long getSend_id() {
		return send_id;
	}
	public void setSend_id(long send_id) {
		this.send_id = send_id;
	}
	
	public long getRece_id() {
		return rece_id;
	}
	public void setRece_id(long rece_id) {
		this.rece_id = rece_id;
	}
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBloodreq() {
		return bloodreq;
	}
	public void setBloodreq(String bloodreq) {
		this.bloodreq = bloodreq;
	}
}

