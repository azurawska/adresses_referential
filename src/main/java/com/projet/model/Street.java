package com.projet.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="street")
public class Street {
	
	@Id
	@Column(name="ID_STREET_NAME")
	private int idStreetName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ID_CITY")
	private City city;
	
	@Column(name="STREET_NAME_LABEL")
	private String streetNameLabel;
	
	@Column(name="STREET_NAME_LABEL_LIGHT")
	private String streetNameLabelLight;

	public int getIdStreetName() {
		return idStreetName;
	}

	public void setIdStreetName(int idStreetName) {
		this.idStreetName = idStreetName;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getStreetNameLabel() {
		return streetNameLabel;
	}

	public void setStreetNameLabel(String streetNameLabel) {
		this.streetNameLabel = streetNameLabel;
	}

	public String getStreetNameLabelLight() {
		return streetNameLabelLight;
	}

	public void setStreetNameLabelLight(String streetNameLabelLight) {
		this.streetNameLabelLight = streetNameLabelLight;
	}
}