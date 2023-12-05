package com.coderscampus.benWoodardAssignment6;

import java.text.ParseException;

public class TeslaSalesReportApplication {

	public static void main(String[] args) throws ParseException {
		
		ReportsService reportsService = new ReportsService();
		reportsService.generateReport("model3.csv", "Model 3");
		reportsService.generateReport("modelS.csv", "Model S");
		reportsService.generateReport("modelX.csv", "Model X");
	}

}
