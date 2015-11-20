package com.example.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SOLID_KEYWORD")
public class SolidKeyword {

	@Id
	@Column(name = "SK_ID")
	private long id;

	@Column(name = "S_ID")
	private long sId;

	@Column(name = "K_ID")
	private long kId;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the sId
	 */
	public long getsId() {
		return sId;
	}

	/**
	 * @param sId
	 *            the sId to set
	 */
	public void setsId(long sId) {
		this.sId = sId;
	}

	/**
	 * @return the kId
	 */
	public long getkId() {
		return kId;
	}

	/**
	 * @param kId
	 *            the kId to set
	 */
	public void setkId(long kId) {
		this.kId = kId;
	}
}
