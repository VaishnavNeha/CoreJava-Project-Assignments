package com.neha.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question1 {

	public static void main(String[] args) {
		// create map to store
        Map<String, List<City>> map = new HashMap<>();

        // create list one and store values
        List<City> valSetOne = new ArrayList<City>();
        valSetOne.add(new City("Udaipur",100));
        valSetOne.add(new City("Chittorgarh",210));

        // create list two and store values
        List<City> valSetTwo = new ArrayList<City>();
        valSetTwo.add(new City("Lucknow",500));
        valSetTwo.add(new City("Noida",200));
        
        
     // create list three and store values
        List<City> valSetThree = new ArrayList<City>();
        valSetThree.add(new City("Gwarior",250));
        valSetThree.add(new City("Bhopal",180));
       

        // put values into map
        map.put("Rajasthan", valSetOne);
        map.put("UP", valSetTwo);
        map.put("MP", valSetThree);

        // iterate and display values
        System.out.println("Fetching Keys and corresponding [Multiple] Values n");
        for (Map.Entry<String, List<City>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<City> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values + "n");
        }

	}

}
