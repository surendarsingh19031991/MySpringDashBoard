package com.spring.angular.dashboard.spring_angular_dashboard;

public class DashBoard {
	
	private String name;
	
	private String[] dataNameArr;
	
	private int[] dataArr;
	
	DashBoard(String name,String[] dataNameArr,int[] dataArr){
		this.name=name;
		this.dataNameArr=dataNameArr;
		this.dataArr=dataArr;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String[] getDataNameArr() {
		return dataNameArr;
	}



	public void setDataNameArr(String[] dataNameArr) {
		this.dataNameArr = dataNameArr;
	}



	public int[] getDataArr() {
		return dataArr;
	}



	public void setDataArr(int[] dataArr) {
		this.dataArr = dataArr;
	}
	
	
	
	

}
