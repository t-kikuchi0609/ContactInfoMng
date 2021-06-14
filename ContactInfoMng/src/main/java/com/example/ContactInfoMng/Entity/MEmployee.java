package com.example.ContactInfoMng.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="m_employee")
public class MEmployee {
	
	
	@Id
	@Column(name="E_NUM" ,nullable = false ,columnDefinition = "CHAR(5)")
	public String E_NUM;
	
	@Column(name="E_NAME" ,nullable = false ,columnDefinition = "CHAR(40)")
	public String E_NAME;

	@Column(name="E_YEAR" ,nullable = false ,columnDefinition = "int")
	public int E_YEAR;
	
	@Column(name="DEPART_CD" ,columnDefinition = "CHAR(2)")
	public String DEPART_CD;
	
	@Column(name="UPDATE_DATE" ,columnDefinition = "datetime")
	public String UPDATE_DATE;
	
	@Column(name="UPDATE_USER" ,columnDefinition = "CHAR(40)")
	public String UPDATE_USER;
	
	@Column(name="CREATE_DATE" ,columnDefinition = "datetime")
	public String CREATE_DATE;
	
	@Column(name="CREATE_USER" ,columnDefinition = "CHAR(40)")
	public String CREATE_USER;
	
	//getter setter
	public String getE_num() {
		return E_NUM;
	}
	public void setE_num(String E_NUM) {
		this.E_NUM = E_NUM;
	}
	
	public String getE_name() {
		return E_NAME;
	}
	public void setE_name(String E_NAME) {
		this.E_NAME = E_NAME;
	}

	public int getE_year() {
		return E_YEAR;
	}
	public void setE_year(int E_YEAR) {
		this.E_YEAR = E_YEAR;
	}
	public String getDepart_cd() {
		return DEPART_CD;
	}
	public void setDepart_cd(String DEPART_CD) {
		this.DEPART_CD = DEPART_CD;
	}
	public String getUpdate_date() {
		return UPDATE_DATE;
	}
	public void setUpdate_date(String UPDATE_DATE) {
		this.UPDATE_DATE = UPDATE_DATE;
	}
	public String getUpdate_user() {
		return UPDATE_USER;
	}
	public void setUpdate_user(String UPDATE_USER) {
		this.UPDATE_USER = UPDATE_USER;
	}
	public String getCreate_date() {
		return CREATE_DATE;
	}
	public void setCreate_date(String CREATE_DATE) {
		this.CREATE_DATE = CREATE_DATE;
	}
	public String getCreate_user() {
		return CREATE_USER;
	}
	public void setCreate_user(String CREATE_USER) {
		this.CREATE_USER = CREATE_USER;
	}
	
		public void setAll( String E_NUM
		,String E_NAME 	   ,int E_YEAR
		,String DEPART_CD ,String UPDATE_DATE
		,String UPDATE_USER,String CREATE_DATE
		,String CREATE_USER
	
	) {
	this.E_NAME = E_NAME;
	this.E_YEAR = E_YEAR;
	this.DEPART_CD = DEPART_CD;
	this.UPDATE_DATE = UPDATE_DATE;
	this.UPDATE_USER = UPDATE_USER;
	this.CREATE_DATE = CREATE_DATE;
	this.CREATE_USER = CREATE_USER;

}

	
	
}
