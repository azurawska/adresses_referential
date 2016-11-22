package com.projet.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="area")
public class Area {
	
	@Id
	@Column(name="ID_AREA", nullable=false)
	private int idArea;
	
	@Column(name="AREA_LABEL")
	private String areaLabel;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ID_COUNTRY")
	private Country country;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="LANGUAGE_ID")
	private Language language;

	public int getIdArea() {
		return idArea;
	}

	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}

	public String getAreaLabel() {
		return areaLabel;
	}

	public void setAreaLabel(String areaLabel) {
		this.areaLabel = areaLabel;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}
}