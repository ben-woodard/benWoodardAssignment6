package com.coderscampus.benWoodardAssignment6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SalesDataService {

	private final String MODEL3 = "./teslaDataCSV/model3.csv";
	private final String MODELS = "./teslaDataCSV/models.csv";
	private final String MODELX = "./teslaDataCSV/modelx.csv";

	FileService fileService = new FileService();

	public void salesDataByYear(List<CarSales> carSales) {
		
		Map<Integer, Integer> salesByYear = carSales.stream()
				.collect(Collectors.groupingBy(CarSales::getYear, Collectors.summingInt(CarSales::getSales)));
		
		Set<Entry<Integer, Integer>> entrySet = salesByYear.entrySet();
		entrySet.stream()
				.forEach((entry) -> System.out.println("20" + entry.getKey() + " -> " + entry.getValue()));
	}

//	public void worstSalesMonth(List<CarSales> carSales, String carType) {
//
//		Integer worstSalesAmount = carSales.stream().map(cars -> cars.getSalesAmount()).min(Integer::compare).get();
//
//		for (CarSales cars : carSales) {
//			if ((cars.getSalesAmount()).equals(worstSalesAmount)) {
//				System.out.println("The worst month for " + carType + " was " + cars.getMonth() + "-" + cars.getYear());
//			}
//		}
//	}
//
//	public void bestSalesMonth(List<CarSales> carSales, String carType) throws ParseException {
//		Integer bestSalesAmount = carSales.stream()
//										  .map(cars -> cars.getSalesAmount())
//										  .max(Integer::compare)
//										  .get();
//
//		for (CarSales cars : carSales) {
//			if ((cars.getSalesAmount()).equals(bestSalesAmount)) {
//				String date = "20" + cars.getYear(); 
//				LocalDateTime newDate = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("yyyy"));
//				System.out.println(newDate);
//			
//				
////				System.out.println("The best month for " + carType + " was " + cal);
//			}
//		}
//	}
}
