package com.dac.spring2;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int id;
	private String name;
	
	private List<String> deptList; 
	private Set<String> emailList;
	//private Set<Email> emailList;

	public Set<String> getEmailList() {
		return emailList;
	}

	public void setEmailList(Set<String> emailList) {
		this.emailList = emailList;
	}

	Employee() {
	}

	public List<String> getDeptList() {
		return deptList;
	}

	public void setDeptList(List<String> deptList) {
		this.deptList = deptList;
	}

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
