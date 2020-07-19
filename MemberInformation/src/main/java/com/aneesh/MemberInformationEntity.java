package com.aneesh;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="memberTable")
public class MemberInformationEntity {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "membership")
	private String membership;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMembership() {
		return membership;
	}
	public void setMembership(String membership) {
		this.membership = membership;
	}
	
	
	
}
