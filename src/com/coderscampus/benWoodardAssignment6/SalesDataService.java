package com.coderscampus.benWoodardAssignment6;

import java.text.ParseException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SalesDataService {

	// Stream List of CarSale objects - Map with getYear as key and summed getSales
	// as value
	public void salesDataByYear(List<CarSales> carSales) {

		Map<Integer, Integer> salesByYear = carSales.stream()
													.collect(Collectors.groupingBy(CarSales::getYear, Collectors.summingInt(CarSales::getSales)));

		Set<Entry<Integer, Integer>> entrySet = salesByYear.entrySet();

		entrySet.stream()
				.forEach((entry) -> System.out.println(formatYear(entry.getKey()) + entry.getValue()));
	}

	// Best Sales Month/ Year
	public void bestSalesMonth(List<CarSales> carSales, String carModel) throws ParseException {

		Integer bestSalesAmount = carSales.stream()
										  .map(cars -> cars.getSales()).max(Integer::compare)
										  .get();

		carSales.stream()
				.filter(cars -> (cars.getSales()).equals(bestSalesAmount))
				.forEach(cars -> System.out.println("The best month for " + carModel + " was: " + formatDate(cars.getYear(), cars.getMonth())));

	}

	// Worst Sales Month/ Year
	public void worstSalesMonth(List<CarSales> carSales, String carModel) {

		Integer worstSalesAmount = carSales.stream()
										   .map(cars -> cars.getSales())
										   .min(Integer::compare).get();

		List<CarSales> worstSalesObject = carSales.stream()
												  .filter(cars -> (cars.getSales()).equals(worstSalesAmount))
												  .collect(Collectors.toList());

		worstSalesObject.stream()
						.forEach(cars -> System.out.println("The worst month for " + carModel + " was: " + formatDate(cars.getYear(), cars.getMonth())));
	}

	//format year to pattern yyyy
	public String formatYear(Integer year) {
		return "20" + year + " -> ";
	}
	
	//format date to pattern yyyy-MM
	public String formatDate(Integer year, String month) {
		String inputDate = year + "-" + month;
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yy-MMM");
		DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM");
		YearMonth dateToFormat = YearMonth.parse(inputDate, inputFormatter);
		return outputFormatter.format(dateToFormat);
	}
}
