package com.neha.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;

public class Question2 {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list= Arrays.asList(1,2,3,4,4,3,2,5,5,5,9,9,9);
		List<Integer> dublist = new ArrayList<>();

		for(int i=0;i<list.size();i++) {
			System.out.println("key :"+list.get(i)+"    | Value"+map.get(list.get(i)));
			if(map.containsKey(list.get(i)) && map.get(list.get(i)) ==2) {
		
			}
			else if(map.containsKey(list.get(i)) && map.get(list.get(i)) <2) {
				System.out.println("ikkk++  "+i+"  + "+(map.get(list.get(i))+1));
				dublist.add(list.get(i));

				map.put(list.get(i), (map.get(list.get(i))+1));
			}
			else {
				map.put(list.get(i), 1);
				dublist.add(list.get(i));
			}
			
		}
		
		System.out.println(map);
		System.out.println("Dublicate list with 2 elements "+dublist);

		
		
		
	}

}
