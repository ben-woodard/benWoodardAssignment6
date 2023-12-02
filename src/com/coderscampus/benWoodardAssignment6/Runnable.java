package com.coderscampus.benWoodardAssignment6;

import java.util.List;

public class Runnable {

	public static void main(String[] args) {
		FileService fileService = new FileService();
		List<CarSales> carData = fileService.readCarFile("./model3.csv");
		
		for(CarSales cars : carData) {
			System.out.println(cars.toString());
		}

	}

}
