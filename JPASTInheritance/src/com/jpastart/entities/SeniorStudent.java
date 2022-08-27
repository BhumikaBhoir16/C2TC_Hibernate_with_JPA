package com.jpastart.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="6th to 7th std")

public class SeniorStudent extends Student {
	
	private static final long serialVersionUID = 1L;
	
	private String divisionName;

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}
	
	

}
