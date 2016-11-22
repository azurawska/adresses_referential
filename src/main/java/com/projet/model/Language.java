package com.projet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="language")
public class Language {
	
	@Id
	@Column(name="LANGUAGE_ID", nullable=false)
	private long idLangage;
	
	@Column(name="LANGUAGE_CODE", nullable=false)
	private String langageCode;
	
	@Column(name="LANGUAGE_NAME", nullable=false)
	private String langageNom;

	public long getIdLangage() {
		return idLangage;
	}

	public void setIdLangage(long idLangage) {
		this.idLangage = idLangage;
	}

	public String getLangageCode() {
		return langageCode;
	}

	public void setLangageCode(String langageCode) {
		this.langageCode = langageCode;
	}

	public String getLangageNom() {
		return langageNom;
	}

	public void setLangageNom(String langageName) {
		this.langageNom = langageName;
	}
}