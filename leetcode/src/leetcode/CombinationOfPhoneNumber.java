package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.sql.rowset.Joinable;

public class CombinationOfPhoneNumber {
	    public static List<String> letterCombinations(String digits) {
	    	if(digits.length() > 0) {
	    	Map<String, String> map = new HashMap<String, String>();
	        String[] key = {"2","3","4","5","6","7","8","9"};
	        String[] value = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	        //hash
	        for(int i = 0; i < key.length; i++) {
	        	map.put(key[i], value[i]);
	        }
	        //输入处理
	        String[] digits_split= digits.split("");
//	        for(int i = 0; i<digits_split.length; i++) {
//	        	System.out.println(digits_split[i]);
//	        }
	        //求输出数组大小
	        int length = 1;
	        for(int i = 0; i <  digits_split.length; i++) {
	        	length = length*digits_split[i].length();
	        }
	        List<String> out = new LinkedList<String>();
	        out.add("");
	        for (int i = 0; i < digits_split.length; i++) {
	        	int size = out.size();
				for(int j = 0; j < size; j++) {
					String temp = out.remove(0);
					for(int k = 0; k < map.get((digits_split[i])).length(); k++) {
						out.add(temp+map.get((digits_split[i])).charAt(k));
					}
				}
	        }
	        return out;
	    	}
	    	else {
	    		List<String> out = new LinkedList<String>();
	    		return out;
	    	}
	    }
	    public static void main(String arg[]) {
	    	List<String> list = letterCombinations("34");
	    	System.out.println(list);
	    }
}
