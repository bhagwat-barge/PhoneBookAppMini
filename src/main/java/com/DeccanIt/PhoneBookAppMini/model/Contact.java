package com.DeccanIt.PhoneBookAppMini.model;

import java.time.LocalDate;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@NoArgsConstructor
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CONTACT_ID")
	private Integer contactId;
	@Column(name="CONTACT_NAME")
	private String contactName;
	@Column(name="CONTACT_NUMBER")
	private String contactNumber;
	@Column(name="CONTAC_EMAIL")
	private String contactEmail;
	@Column(name="ACTIVE_SWITCH")
	private Character activeSwitch;
	@Column(name="CREATE_DATE")
	private LocalDate createdDate;
	@Column(name="UPDATE_DATE")
	private LocalDate  updateDate;
}
