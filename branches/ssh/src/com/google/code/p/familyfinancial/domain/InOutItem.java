package com.google.code.p.familyfinancial.domain;
import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.Entity;

@Entity
public class InOutItem implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2496048779915384218L;
	
	private Long id;
	private String names;
	private Double value;
	private Integer version;

	@Id 
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	@Version
	@Column(name="OPTLOCK")
	public Integer getVersion() {
		return version;
	}
}
