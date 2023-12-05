package com.coderscampus.benWoodardAssignment6;

import java.text.ParseException;
import java.util.List;

public class ReportsService {
	FileService fileService = new FileService();
	SalesDataService salesDataService = new SalesDataService();

	public void generateReport(String filename, String carModel) {
		List<CarSales> carData = fileService.readCarFile(filename);
		salesDataService.salesDataByYear(carData);
		try {
			salesDataService.bestSalesMonth(carData, carModel);
			salesDataService.worstSalesMonth(carData, carModel);
		} catch (ParseException e) {
			System.out.println("There was a Parse Exception while executing bestSalesMonth method.");
			e.printStackTrace();
		}
		System.out.println();
	}
}
