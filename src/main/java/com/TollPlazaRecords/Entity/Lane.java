package com.TollPlazaRecords.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Lane {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long sr_id;
	@Column
	private String plaza_id;
	@Column
	private int lane_id;
	@Column
	private String direction;
	@Column
	private String reader_id;
	@Column
	private String status;
	@Column
	private String mode;
	@Column
	private String type;
	public Lane() {
		super();
	}
	public Lane(Long sr_id, String plaza_id, int lane_id, String direction, String reader_id, String status,
			String mode, String type) {
		super();
		this.sr_id = sr_id;
		this.plaza_id = plaza_id;
		this.lane_id = lane_id;
		this.direction = direction;
		this.reader_id = reader_id;
		this.status = status;
		this.mode = mode;
		this.type = type;
	}
	public Long getSr_id() {
		return sr_id;
	}
	public void setSr_id(Long sr_id) {
		this.sr_id = sr_id;
	}
	public String getPlaza_id() {
		return plaza_id;
	}
	public void setPlaza_id(String plaza_id) {
		this.plaza_id = plaza_id;
	}
	public int getLane_id() {
		return lane_id;
	}
	public void setLane_id(int lane_id) {
		this.lane_id = lane_id;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getReader_id() {
		return reader_id;
	}
	public void setReader_id(String reader_id) {
		this.reader_id = reader_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	

}
