package ba.bitcamp.w09d04_ListsSetsMaps.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Country {

	private String name;
	private Integer population;
	private Double area;
	
	public Country(String name, Integer population, Double area) {
		super();
		this.name = name;
		this.population = population;
		this.area = area;
	}
	
	public enum SortDetails{
		BY_NAME, BY_AREA, BY_POPULATION
	};
	
	public void sort(ArrayList<Country> countrys, SortDetails eSet){
		
		if (eSet == SortDetails.BY_NAME) {
			ArrayList<Country>.sort(countrys, new Comparator<Country>() {

				@Override
				public int compare(Country o1, Country o2) {
					// TODO Auto-generated method stub
					return 0;
				}
			
			});
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}
	
}
