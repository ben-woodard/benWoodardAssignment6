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
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SalesDataService {

	

	public void salesDataByYear(List<CarSales> carSales) {

		Map<Integer, Integer> salesByYear = carSales.stream()
				 									.collect(Collectors.groupingBy(CarSales::getYear, Collectors.summingInt(CarSales::getSales)));

		Set<Entry<Integer, Integer>> entrySet = salesByYear.entrySet();
		
		entrySet.stream()
			    .forEach((entry) -> System.out.println("20" + entry.getKey() + " -> " + entry.getValue()));
	}

	public void worstSalesMonth(List<CarSales> carSales, String carModel) {

		Integer worstSalesAmount = carSales.stream().map(cars -> cars.getSales()).min(Integer::compare).get();

		carSales.stream()
			    .filter(cars -> (cars.getSales()).equals(worstSalesAmount))
			    .forEach(cars -> System.out.println("The worst month for " + carModel + " was: " + "20" + cars.getYear() + "-" + cars.getMonth()));
	}

	public void bestSalesMonth(List<CarSales> carSales, String carModel) throws ParseException {
		Integer bestSalesAmount = carSales.stream()
										  .map(cars -> cars.getSales())
										  .max(Integer::compare).get();

	   carSales.stream()
				.filter(cars -> (cars.getSales()).equals(bestSalesAmount))
		    	.forEach(cars -> System.out.println("The best month for " + carModel + " was: " + "20" + cars.getYear() + "-" + cars.getMonth()));
	
		
		
		
	}

}
