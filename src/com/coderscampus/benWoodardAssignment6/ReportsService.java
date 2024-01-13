package com.coderscampus.benWoodardAssignment6;

import java.text.ParseException;
import java.util.List;

public class ReportsService{
	FileService fileService = new FileService();
	SalesDataService salesDataService = new SalesDataService();

	public void generateReport(String fileName, String carModel) throws ParseException{
		List<CarSales> carData = fileService.readCarFile(fileName);
		salesDataService.salesDataByYear(carData);
		salesDataService.bestSalesMonth(carData, carModel);
		salesDataService.worstSalesMonth(carData, carModel);
		System.out.println();
	}
}
