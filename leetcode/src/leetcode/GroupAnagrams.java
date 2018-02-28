package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length == 0) return null;
		List<List<String>> out = new ArrayList<>();
		for(int i = 0; i < strs.length; i++) {
			for(int j = 0; j < out.size(); j++) {
				if (myEqual(strs[i], out.get(j).get(0))) {
					out.get(j).add(strs[i]);
					break;
				}
				if (j == out.size()) {
					ArrayList<String> tempList = new ArrayList<>();
					tempList.add(strs[i]);
					out.add(tempList);
					break;
				}
			}
		}
		return out;
    }

	private boolean myEqual(String string1, String string2) {
		if (string1.length() != string2.length()) return false;
		if (string1.length() == 0 && string2.length() == 0) return true;
		int length = string1.length();
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		String[] strings1 = string1.split(null);
		String[] strings2 = string2.split(null);
		for(int i = 0; i < length; i++) {
			if (map1.containsKey(strings1[i])) {
				map1.put(strings1[i], map1.get(strings1[i]) + 1);
			}else {
				map1.put(strings1[i], 1);
			}
			if (map2.containsKey(strings2[i])) {
				map2.put(strings2[i], map2.get(strings2[i]) + 1);
			}else {
				map2.put(strings2[i], 1);
			}
		}
		for(int i = 0; i < length; i++) {
			if (map1.get(strings1[i]) != map2.get(strings1[i])) {
				return false;
			}
		}
		return true;
	}
}
