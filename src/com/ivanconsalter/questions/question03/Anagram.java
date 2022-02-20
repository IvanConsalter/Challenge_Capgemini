package com.ivanconsalter.questions.question03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
	
	public Integer checkSubstringPairs(String string) {
		
		Map<String, Integer> mapPairs = new HashMap<>();
		
		for(int i = 0; i < string.length(); i++) {
			for(int j = i; j < string.length(); j++) {
				
				char[] arrayChar = string.substring(i, (j + 1)).toCharArray();
				Arrays.sort(arrayChar);
				String stringSorted = new String(arrayChar);
				
				if(mapPairs.containsKey(stringSorted)) {
					mapPairs.put(stringSorted, mapPairs.get(stringSorted) + 1);
				}
				else {
					mapPairs.put(stringSorted, 1);
				}
			}
		}
		
		int pairs = 0;
		for(String s : mapPairs.keySet()) {
			int valueOfMap = mapPairs.get(s);
			pairs += (valueOfMap * (valueOfMap - 1)) / 2;
		}
		
		return pairs;
	}

}
