package com.example.ContactInfoMng.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@IdClass(McodePkey.class)
@Table(name="m_code")
public class Mcode {
	
	@Id
	@Column(name="CODE_CD" ,nullable = false ,columnDefinition = "CHAR(3)")
	public String CODE_CD;
	
	@Column(name="CODE_CLASS" ,nullable = false ,columnDefinition = "CHAR(50)")	
	public String CODE_CLASS;	
	
	@Id
	@Column(name="CODE_VALUE" ,nullable = false,columnDefinition = "CHAR(3)")
	public String CODE_VALUE;
	
	@Column(name="CODE_NAME" ,nullable = false,columnDefinition = "CHAR(50)")
	public String CODE_NAME;	
	
	@Column(name="CODE_DESC" ,columnDefinition = "CHAR(256)")
	public String CODE_DESC;
	
	@Column(name="CODE_NUM1" ,columnDefinition = "decimal")
	public String CODE_NUM1;
	
	@Column(name="CODE_NUM2" ,columnDefinition = "decimal")
	public String CODE_NUM2;
	
	@Column(name="CODE_NUM3" ,columnDefinition = "decimal")
	public String CODE_NUM3;
	
	@Column(name="CODE_CHAR1" ,columnDefinition = "CHAR(256)")
	public String CODE_CHAR1;
	
	@Column(name="CODE_CHAR2" ,columnDefinition = "CHAR(256)")
	public String CODE_CHAR2;
	
	@Column(name="CODE_CHAR3" ,columnDefinition = "CHAR(256)")
	public String CODE_CHAR3;
	
	@Column(name="CREATE_DATE" ,columnDefinition = "datetime")
	public String CREATE_DATE;
	
	@Column(name="CREATE_USER" ,columnDefinition = "CHAR(10)")
	public String CREATE_USER;
	
	@Column(name="UPDATE_DATE" ,columnDefinition = "datetime")
	public String UPDATE_DATE;
	
	@Column(name="UPDATE_USER" ,columnDefinition = "CHAR(10)")
	public String UPDATE_USER;

	//ここからゲッターセッター}
	public String getCode_cd() {
		return CODE_CD;
	}
	public void setCode_cd(String CODE_CD) {
		this.CODE_CD = CODE_CD;
	}
	public String getCode_class() {
		return CODE_CLASS;
	}
	public void setCode_class(String CODE_CLASS) {
		this.CODE_CLASS = CODE_CLASS;
	}
	public String getCode_value() {
		return CODE_VALUE;
	}
	public void setCode_value(String CODE_VALUE) {
		this.CODE_VALUE = CODE_VALUE;
	}
	public String getCode_name() {
		return CODE_NAME;
	}
	public void setCode_name(String CODE_NAME) {
		this.CODE_NAME = CODE_NAME;
	}
	public String getCode_desc() {
		return CODE_DESC;
	}
	public void setCode_desc(String CODE_DESC) {
		this.CODE_DESC = CODE_DESC;
	}
	public String getCode_num1() {
		return CODE_NUM1;
	}
	public void setCode_num1(String CODE_NUM1) {
		this.CODE_NUM1 = CODE_NUM1;
	}
	public String getCode_num2() {
		return CODE_NUM2;
	}
	public void setCode_num2(String CODE_NUM2) {
		this.CODE_NUM2 = CODE_NUM2;
	}
	public String getCode_num3() {
		return CODE_NUM3;
	}
	public void setCode_num3(String CODE_NUM3) {
		this.CODE_NUM3 = CODE_NUM3;
	}
	public String getCode_char1() {
		return CODE_CHAR1;
	}
	public void setCode_char1(String CODE_CHAR1) {
		this.CODE_CHAR1 = CODE_CHAR1;
	}
	public String getCode_char2() {
		return CODE_CHAR2;
	}
	public void setCode_char2(String CODE_CHAR2) {
		this.CODE_CHAR2 = CODE_CHAR2;
	}
	public String getCode_char3() {
		return CODE_CHAR3;
	}
	public void setCode_char3(String CODE_CHAR3) {
		this.CODE_CHAR3 = CODE_CHAR3;
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
	public String getCupdate_date() {
		return UPDATE_DATE;
	}
	public void setCupdate_date(String UPDATE_DATE) {
		this.UPDATE_DATE = UPDATE_DATE;
	}
	public String getCupdate_user() {
		return UPDATE_USER;
	}
	public void setCupdate_user(String UPDATE_USER) {
		this.UPDATE_USER = UPDATE_USER;
	}
	
	public void setAll(  String CODE_CD
						,String CODE_CLASS ,String CODE_NAME
						,String CODE_VALUE  ,String CODE_DESC
						,String CODE_NUM1  ,String CODE_NUM2
						,String CODE_NUM3  ,String CODE_CHAR1
						,String CODE_CHAR2 ,String CODE_CHAR3
						,String CREATE_DATE,String CREATE_USER
						,String UPDATE_DATE ,String UPDATE_USER
			) {
				this.CODE_CD = CODE_CD; 
				this.CODE_CLASS = CODE_CLASS;
				this.CODE_NAME = CODE_NAME;
				this.CODE_VALUE = CODE_VALUE;
				this.CODE_DESC = CODE_DESC;
				this.CODE_NUM1 = CODE_NUM1;
				this.CODE_NUM2 = CODE_NUM2;
				this.CODE_NUM3 = CODE_NUM3;
				this.CODE_CHAR1 = CODE_CHAR1;
				this.CODE_CHAR2 = CODE_CHAR2;
				this.CODE_CHAR3 = CODE_CHAR3;
				this.CREATE_DATE = CREATE_DATE;
				this.CREATE_USER = CREATE_USER;
				this.UPDATE_DATE = UPDATE_DATE;
				this.UPDATE_USER = UPDATE_USER;
			  }
}
