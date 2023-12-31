package com.coderscampus.benWoodardAssignment6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {
	
	public List<CarSales> readCarFile(String filename) {
		List<CarSales> carSalesData = new ArrayList<>();
		String[] salesDataArray = new String[2];
		String line;
		CarSales carSales;

		try (BufferedReader fileReader = new BufferedReader(new FileReader(filename))) {
			line = fileReader.readLine();
			while ((line = fileReader.readLine()) != null) {
				salesDataArray = line.split("-|,");
				Integer yearIndex = Integer.parseInt(salesDataArray[1]);
				Integer salesIndex = Integer.parseInt(salesDataArray[2]);
				carSales = new CarSales(salesDataArray[0], yearIndex, salesIndex);
				carSalesData.add(carSales);
			}
		} catch (IOException e) {
			System.out.println("There was an exception while reading the file.");
			e.printStackTrace();
		} 
		return carSalesData;
	}
}
