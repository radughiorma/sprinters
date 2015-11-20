package com.example.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENT_PREFERENCES")
public class ClientPreferences {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CP_ID")
	private long id;

	@Column(name = "S_ID")
	private long sId;

	@Column(name = "K_ID")
	private long kId;
}
