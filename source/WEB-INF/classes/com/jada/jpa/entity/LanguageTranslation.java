/*
 * Copyright 2007-2010 JadaSite.

 * This file is part of JadaSite.
 
 * JadaSite is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * JadaSite is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with JadaSite.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jada.jpa.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * LanguageTranslation generated by hbm2java
 */
@Entity
@Table(name = "language_translation")
public class LanguageTranslation implements java.io.Serializable {

	private static final long serialVersionUID = 7856609183162594199L;
	private Long langTranId;
	private String langTranKey;
	private String langTranValue;
	private char langSource;
	private String recUpdateBy;
	private Date recUpdateDatetime;
	private String recCreateBy;
	private Date recCreateDatetime;
	private Language language;

	public LanguageTranslation() {
	}

	public LanguageTranslation(String langTranKey, String langTranValue,
			char langSource, String recUpdateBy, Date recUpdateDatetime,
			String recCreateBy, Date recCreateDatetime) {
		this.langTranKey = langTranKey;
		this.langTranValue = langTranValue;
		this.langSource = langSource;
		this.recUpdateBy = recUpdateBy;
		this.recUpdateDatetime = recUpdateDatetime;
		this.recCreateBy = recCreateBy;
		this.recCreateDatetime = recCreateDatetime;
	}

	public LanguageTranslation(String langTranKey, String langTranValue,
			char langSource, String recUpdateBy, Date recUpdateDatetime,
			String recCreateBy, Date recCreateDatetime, Language language) {
		this.langTranKey = langTranKey;
		this.langTranValue = langTranValue;
		this.langSource = langSource;
		this.recUpdateBy = recUpdateBy;
		this.recUpdateDatetime = recUpdateDatetime;
		this.recCreateBy = recCreateBy;
		this.recCreateDatetime = recCreateDatetime;
		this.language = language;
	}

	@Id
	@GeneratedValue
	@Column(name = "lang_tran_id", nullable = false)
	public Long getLangTranId() {
		return this.langTranId;
	}

	public void setLangTranId(Long langTranId) {
		this.langTranId = langTranId;
	}

	@Column(name = "lang_tran_key", nullable = false, length = 50)
	public String getLangTranKey() {
		return this.langTranKey;
	}

	public void setLangTranKey(String langTranKey) {
		this.langTranKey = langTranKey;
	}

	@Column(name = "lang_tran_value", nullable = false, length = 255)
	public String getLangTranValue() {
		return this.langTranValue;
	}

	public void setLangTranValue(String langTranValue) {
		this.langTranValue = langTranValue;
	}

	@Column(name = "lang_source", nullable = false, length = 1)
	public char getLangSource() {
		return this.langSource;
	}

	public void setLangSource(char langSource) {
		this.langSource = langSource;
	}

	@Column(name = "rec_update_by", nullable = false, length = 20)
	public String getRecUpdateBy() {
		return this.recUpdateBy;
	}

	public void setRecUpdateBy(String recUpdateBy) {
		this.recUpdateBy = recUpdateBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "rec_update_datetime", nullable = false)
	public Date getRecUpdateDatetime() {
		return this.recUpdateDatetime;
	}

	public void setRecUpdateDatetime(Date recUpdateDatetime) {
		this.recUpdateDatetime = recUpdateDatetime;
	}

	@Column(name = "rec_create_by", nullable = false, length = 20)
	public String getRecCreateBy() {
		return this.recCreateBy;
	}

	public void setRecCreateBy(String recCreateBy) {
		this.recCreateBy = recCreateBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "rec_create_datetime", nullable = false)
	public Date getRecCreateDatetime() {
		return this.recCreateDatetime;
	}

	public void setRecCreateDatetime(Date recCreateDatetime) {
		this.recCreateDatetime = recCreateDatetime;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lang_id")
	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

}