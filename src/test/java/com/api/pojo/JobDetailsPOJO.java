package com.api.pojo;

public class JobDetailsPOJO {
	
	private String name;
	private String job;
	public JobDetailsPOJO(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "JobDetailsPOJO [name=" + name + ", job=" + job + "]";
	}
	
	

}
