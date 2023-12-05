package com.coderscampus.benWoodardAssignment6;

import java.text.ParseException;
import java.util.List;

public class TeslaSalesReportApplication {

	public static void main(String[] args) throws ParseException {

		ReportsService reportsService = new ReportsService();
		reportsService.generateReport("./teslaDataCSV/model3.csv", "Model 3");
		reportsService.generateReport("./teslaDataCSV/modelS.csv", "Model S");
		reportsService.generateReport("./teslaDataCSV/modelX.csv", "Model X");
	}

}
