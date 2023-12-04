package com.coderscampus.benWoodardAssignment6;

import java.text.ParseException;
import java.util.List;

public class Runnable {

	public static void main(String[] args) throws ParseException {
		FileService fileService = new FileService();
		List<CarSales> carData =  fileService.readCarFile("./teslaDataCSV/models.csv");
		SalesDataService salesData = new SalesDataService();
		salesData.salesDataByYear(carData);

//		salesData.worstSalesMonth(carData, "model 3");
//		salesData.bestSalesMonth(carData, "model 3");
		
		
//		for(CarSales cars : carData) {
//			System.out.println(cars.toString());
//		}

	}

}
