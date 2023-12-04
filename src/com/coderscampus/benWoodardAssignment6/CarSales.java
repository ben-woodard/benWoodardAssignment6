package com.coderscampus.benWoodardAssignment6;

public class CarSales {

	private String month;
	private Integer year;
	private Integer sales;


	public CarSales(String month, Integer year, Integer salesAmount) {
		this.month = month;
		this.year = year;
		this.sales = salesAmount;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer salesAmount) {
		this.sales = salesAmount;
	}

	@Override
	public String toString() {
		return "CarSales [month=" + month + ", year=" + year + ", salesAmount=" + sales + "]";
	}

}
