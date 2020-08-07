package com.aneesh.service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="memberTable")
public class MemberDetailsEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="membershipId")
	private String membershipId;
	
	
	@Column(name = "membership")
	private String membership;
	
	
	public String getMembershipId() {
		return membershipId;
	}
	public void setMembershipId(String membershipId) {
		this.membershipId = membershipId;
	}

	public String getMembership() {
		return membership;
	}
	public void setMembership(String membership) {
		this.membership = membership;
	}
	@Override
	public String toString() {
		return "MemberInformationEntity [id=" + id + ", membershipId=" + membershipId + ", membership=" + membership
				+ "]";
	}
	
	
	
}
