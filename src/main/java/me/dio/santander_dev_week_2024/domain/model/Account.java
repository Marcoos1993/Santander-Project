package me.dio.santander_dev_week_2024.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity (name = "tb_account")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true )
	private String number;
	
	private String agency;
	
	@Column(precision = 13)
	private Float balance;
	
	
	@Column(name = "available_limit", precision = 13)
	private Float limit;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	} 

	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	
	public Float getBalance() {
		return balance;
	}


	public Float getLimit() {
		return limit;
	}
	
	public void setLimit(Float limit) {
		this.limit = limit;
	}
	
	

}
