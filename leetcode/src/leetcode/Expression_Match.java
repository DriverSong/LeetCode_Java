package leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression_Match {
	
	public boolean isMatch(String s, String p) {
		
		Pattern pattern = Pattern.compile(p);
	    // 忽略大小写的写法
	    // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(s);
	    // 查找字符串中是否有匹配正则表达式的字符/字符串
	    boolean rs = matcher.matches();
	    return rs;
	        
	}

}
