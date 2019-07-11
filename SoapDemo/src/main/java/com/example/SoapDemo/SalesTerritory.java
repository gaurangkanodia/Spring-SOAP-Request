package com.example.SoapDemo;

import java.util.List;


public class SalesTerritory {

	String name;
	long id;
	long level;
	
	long parent_territory_id;
	long current_owner_id;
	long employee_responsible_id;			
	List<Long> territory_team_id;
	List<Accounts> accounts;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getLevel() {
		return level;
	}
	public void setLevel(long level) {
		this.level = level;
	}
	public long getParent_territory_id() {
		return parent_territory_id;
	}
	public void setParent_territory_id(long parent_territory_id) {
		this.parent_territory_id = parent_territory_id;
	}
	public long getCurrent_owner_id() {
		return current_owner_id;
	}
	public void setCurrent_owner_id(long current_owner_id) {
		this.current_owner_id = current_owner_id;
	}
	public long getEmployee_responsible_id() {
		return employee_responsible_id;
	}
	public void setEmployee_responsible_id(long employee_responsible_id) {
		this.employee_responsible_id = employee_responsible_id;
	}
	public List<Long> getTerritory_team_id() {
		return territory_team_id;
	}
	public void setTerritory_team_id(List<Long> territory_team_id) {
		this.territory_team_id = territory_team_id;
	}
	public List<Accounts> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Accounts> accounts) {
		this.accounts = accounts;
	}
	
}
