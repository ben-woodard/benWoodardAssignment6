package com.coderscampus.benWoodardAssignment6;

import java.text.ParseException;
import java.util.List;

public class Runnable {

	public static void main(String[] args) throws ParseException {
//		FileService fileService = new FileService();
//		SalesDataService salesDataService = new SalesDataService();
//		List<CarSales> poop = fileService.readCarFile("./teslaDataCSV/model3.csv");
//		
//		salesDataService.bestSalesMonth(poop, "Model poop");

		ReportsService reportsService = new ReportsService();
		reportsService.generateReport("./teslaDataCSV/model3.csv", "Model 3");
		reportsService.generateReport("./teslaDataCSV/modelS.csv", "Model S");
		reportsService.generateReport("./teslaDataCSV/modelX.csv", "Model X");

	

	}

}
