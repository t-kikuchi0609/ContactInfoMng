package com.example.ContactInfoMng.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="t_contact")
public class Tcontact {
	
	
	@Id
	@Column(name="CONTACT_NO" ,nullable = false ,columnDefinition = "int")
	public int CONTACT_NO;
	
	@Column(name="CONTACT_CD" ,nullable = false ,columnDefinition = "CHAR(3)")	
	public String CONTACT_CD;	
	
	@Column(name="COMPANY" ,columnDefinition = "CHAR(100)")
	public String COMPANY;
	
	@Column(name="REGISTER" ,nullable = false ,columnDefinition = "CHAR(41)")	
	public String REGISTER;	
	
	@Column(name="TEL" ,nullable = false,columnDefinition = "CHAR(13)")
	public String TEL;
	
	@Column(name="MALL" ,nullable = false ,columnDefinition = "CHAR(100)")	
	public String MALL;	
	
	@Column(name="POSTAL_CODE" ,columnDefinition = "CHAR(8)")
	public String POSTAL_CODE;
	
	@Column(name="STREET_ADDRESS" ,columnDefinition = "CHAR(400)")	
	public String STREET_ADDRESS;	
	
	@Column(name="CONTENTS" ,nullable = false,columnDefinition = "CHAR(2000)")
	public String CONTENTS;
	
	@Column(name="SALE_STAFF_NO" ,columnDefinition = "CHAR(5)")	
	public String SALE_STAFF_NO;	
	
	@Column(name="RECEPTION_DATE" ,columnDefinition = "datetime")
	public String RECEPTION_DATE;	
	
	@Column(name="CREATE_DATE" ,columnDefinition = "datetime")
	public String CREATE_DATE;
	
	@Column(name="CREATE_USER" ,columnDefinition = "CHAR(10)")
	public String CREATE_USER;
	
	@Column(name="UPDATE_DATE" ,columnDefinition = "datetime")
	public String UPDATE_DATE;
	
	@Column(name="UPDATE_USER" ,columnDefinition = "CHAR(10)")
	public String UPDATE_USER;
	
	

	public int getContact_no() {
		return CONTACT_NO;
	}

	public void setContact_no(int contact_no) {
		this.CONTACT_NO = contact_no;
	}

	public String getContact_cd() {
		return CONTACT_CD;
	}

	public void setContact_cd(String contact_cd) {
		this.CONTACT_CD = contact_cd;
	}

	public String getCompany() {
		return COMPANY;
	}

	public void setCompany(String company) {
		this.COMPANY = company;
	}

	public String getRegister() {
		return REGISTER;
	}

	public void setRegister(String register) {
		this.REGISTER = register;
	}

	public String getTel() {
		return TEL;
	}

	public void setTel(String tel) {
		this.TEL = tel;
	}

	public String getMall() {
		return MALL;
	}

	public void setMall(String mall) {
		this.MALL = mall;
	}

	public String getPostal_code() {
		return POSTAL_CODE;
	}

	public void setPostal_code(String postal_code) {
		this.POSTAL_CODE = postal_code;
	}

	public String getStreet_address() {
		return STREET_ADDRESS;
	}

	public void setStreet_address(String street_address) {
		this.STREET_ADDRESS = street_address;
	}

	public String getContents() {
		return CONTENTS;
	}

	public void setContents(String contents) {
		this.CONTENTS = contents;
	}

	public String getSale_staff_no() {
		return SALE_STAFF_NO;
	}

	public void setSale_staff_no(String sale_staff_no) {
		this.SALE_STAFF_NO = sale_staff_no;
	}

	public String getReception_date() {
		return RECEPTION_DATE;
	}

	public void setReception_date(String reception_date) {
		this.RECEPTION_DATE = reception_date;
	}

	public String getCREATE_date() {
		return CREATE_DATE;
	}

	public void setCREATE_date(String create_date) {
		this.CREATE_DATE = create_date;
	}

	public String getCREATE_user() {
		return CREATE_USER;
	}

	public void setCREATE_user(String create_user) {
		this.CREATE_USER = create_user;
	}

	public String getUPDATE_date() {
		return UPDATE_DATE;
	}

	public void setUPDATE_date(String update_date) {
		this.UPDATE_DATE = update_date ;
	}

	public String getUPDATE_user() {
		return UPDATE_USER;
	}

	public void setUPDATE_user(String update_user) {
		this.UPDATE_USER = update_user;
	}
	

	
	public void setAll(
			 String contact_cd 		,String company
			,String register  		,String tel
			,String mall  	    	,String postal_code
			,String street_address 	,String contents

) {
	this.CONTACT_CD = contact_cd;
	this.COMPANY = company;
	this.REGISTER = register;
	this.TEL = tel;
	this.MALL = mall;
	this.POSTAL_CODE = postal_code ;
	this.STREET_ADDRESS = street_address;
	this.CONTENTS = contents;

  }

	public void setAll2(String sale_staff_no
					   ,String reception_date
					   ,String update_date
					   ,String update_user
			) {
				this.SALE_STAFF_NO = sale_staff_no;
				this.RECEPTION_DATE = reception_date;
				this.UPDATE_DATE = update_date;
				this.UPDATE_USER = update_user;
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
	
	
	
	