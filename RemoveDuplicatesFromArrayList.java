package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		final List<Integer> listWithDuplicates = new ArrayList<>();

		listWithDuplicates.add(10);
		listWithDuplicates.add(20);
		listWithDuplicates.add(30);
		listWithDuplicates.add(30);
		listWithDuplicates.add(50);
		listWithDuplicates.add(50);
		listWithDuplicates.add(10);

		System.out.println("Before removing duplicates :: " + Arrays.toString(listWithDuplicates.toArray()));
//		final List<Integer> listWithoutDuplicates = new ArrayList<>(new HashSet<>(listWithDuplicates));
//		 
//        System.out.println("After removing duplicates :: "
//+ Arrays.toString(listWithoutDuplicates.toArray()));
//		
//		final List<Integer> listWithoutDuplicates = listWithDuplicates .stream().distinct().collect(Collectors.toList());
//		System.out.println("After  removing duplicates : : " + Arrays.toString(listWithoutDuplicates.toArray()));
	
		 final List<Integer> listWithoutDuplicates = new ArrayList<>(
		         new LinkedHashSet<>(listWithDuplicates));
		        System.out.println("After removing duplicates :: " 
		               + Arrays.toString(listWithoutDuplicates.toArray()));
	
	}

}
