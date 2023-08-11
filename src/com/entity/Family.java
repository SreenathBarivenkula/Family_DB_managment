package com.entity;


public class Family {
	private int familyId;
	private String familyName;
	private String familyRelation;
	private String familyPhone;
    private String familyCity;
    
	public Family(int familyId, String familyName, String familyRelation, String familyPhone, String familyCity) {
		super();
		this.familyId = familyId;
		this.familyName = familyName;
		this.familyRelation =familyRelation;
		this.familyPhone = familyPhone;
		this.familyCity = familyCity;
	}
	public Family (String familyName,String familyRelation, String familyPhone, String familyCity) {
		super();
		this.familyName = familyName;
		this.familyRelation =familyRelation;
		this.familyPhone = familyPhone;
		this.familyCity = familyCity;
	}
	public Family() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFamilyId() {
		return familyId;
	}
	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getFamilyRelation() {
		return familyRelation;
	}
	public void setFamilyRelation(String familyRelation) {
		this.familyRelation = familyRelation;
	}
	public String getFamilyPhone() {
		return familyPhone;
	}
	public void setFamilyPhone(String familyPhone) {
		this.familyPhone = familyPhone;
	}
	public String getFamilyCity() {
		return familyCity;
	}
	public void setFamilyCity(String familyCity){
		this.familyCity = familyCity;
	}
	@Override
	public String toString() {
		return "Family [familyId=" + familyId + ", familyName=" + familyName + ", familyRelation=" + familyRelation+" , familyPhone="
				+ familyPhone + ", familyCity=" + familyCity + "]";
	}
    
	

}
