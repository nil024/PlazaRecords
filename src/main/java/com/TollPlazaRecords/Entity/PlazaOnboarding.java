package com.TollPlazaRecords.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class PlazaOnboarding {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long sr_id;
	
	@Column
	private int plaza_id;
	@Column
	private String plaza_name;
	@Column
	private String org_id;
	@Column
	private String geoCode;
	@Column
	private String type;
	@Column
	private String subtype;
	
	public PlazaOnboarding() {
		super();
	}
	public PlazaOnboarding(long sr_id, int plaza_id, String plaza_name, String org_id, String geoCode, String type,
			String subtype) {
		super();
		this.sr_id = sr_id;
		this.plaza_id = plaza_id;
		this.plaza_name = plaza_name;
		this.org_id = org_id;
		this.geoCode = geoCode;
		this.type = type;
		this.subtype = subtype;
	}
	public long getSr_id() {
		return sr_id;
	}
	public void setSr_id(long sr_id) {
		this.sr_id = sr_id;
	}
	public int getPlaza_id() {
		return plaza_id;
	}
	public void setPlaza_id(int plaza_id) {
		this.plaza_id = plaza_id;
	}
	public String getPlaza_name() {
		return plaza_name;
	}
	public void setPlaza_name(String plaza_name) {
		this.plaza_name = plaza_name;
	}
	public String getOrg_id() {
		return org_id;
	}
	public void setOrg_id(String org_id) {
		this.org_id = org_id;
	}
	public String getGeoCode() {
		return geoCode;
	}
	public void setGeoCode(String geoCode) {
		this.geoCode = geoCode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSubtype() {
		return subtype;
	}
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}
	
}
