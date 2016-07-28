package com.amex.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Problem3_Collections {
	// Requirements: Generate 100 random numbers between 1-1000.
	// Put the numbers into a Map. Then move them to a Set.
	// Then move the numbers into a List. Then sort the numbers.
	// Finally output the numbers, with one number on every row

	public void collectionFun() {
		Integer intArr[] = new Integer[100];
		for (int i = 0; i < 100; i++) {
			intArr[i] = (int) (Math.random() * 1000 + 1);
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < 100; i++) {
			map.put(intArr[i], intArr[i]);
		}
		Set<Integer> set = new HashSet<>(map.values());
		List<Integer> list = new ArrayList<>();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			list.add(it.next());
		}
		Collections.sort(list);
		list.stream().forEach(System.out::println);

	}

	public static void main(String[] args) {
		Problem3_Collections collections = new Problem3_Collections();
		collections.collectionFun();
	}

}
