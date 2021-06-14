package com.example.ContactInfoMng.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class McodePkey implements Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Column
		public String CODE_CD;
		@Column
		public String CODE_VALUE;

}
