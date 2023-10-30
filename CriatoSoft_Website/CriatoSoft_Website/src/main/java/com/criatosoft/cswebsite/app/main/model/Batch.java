package com.criatosoft.cswebsite.app.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Batch {
	
	@Id
	private String batchId;
	private String batvhName;
	private String batchTime;
	private String trainerName;
	
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getBatvhName() {
		return batvhName;
	}
	public void setBatvhName(String batvhName) {
		this.batvhName = batvhName;
	}
	public String getBatchTime() {
		return batchTime;
	}
	public void setBatchTime(String batchTime) {
		this.batchTime = batchTime;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

}
