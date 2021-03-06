package com.francesc.webapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.francesc.webapplication.model.base.BaseEntity;

@Entity
@Table(name = "USER")
public class User extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2972209665971039548L;

	private Long id;
	private String name;
	private String password;
	private String gender;
	private String country;
	private String aboutYou;
	private String[] community;
	private Boolean mailingList;

	@Override
	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@NotBlank
	@NotNull
	@Column(name = "USER_NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@NotBlank
	@Column(name = "USER_PASSWORD")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "USER_GENDER")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "USER_COUNTRY")
	public String getCountry() {

		return country;

	}

	public void setCountry(String country) {

		this.country = country;

	}

	@Column(name = "USER_ABOUT_YOU")
	public String getAboutYou() {

		return aboutYou;

	}

	public void setAboutYou(String aboutYou) {

		this.aboutYou = aboutYou;

	}

	@Column(name = "USER_COMMUNITY")
	public String[] getCommunity() {

		return community;

	}

	public void setCommunity(String[] community) {

		this.community = community;

	}

	@Column(name = "USER_MAILING_LIST")
	public Boolean getMailingList() {

		return mailingList;

	}

	public void setMailingList(Boolean mailingList) {

		this.mailingList = mailingList;

	}
}
