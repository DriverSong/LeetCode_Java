package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {
//	public List<String> generateParenthesis(int n) {
//		int count = n;
//		List<String> out = new ArrayList<>();
//		backTrack(out, new Stack<>(), count - 1, '(', new ArrayList<>());
//		return out;
//	}
//
//	private void backTrack(List<String> out, Stack<Character> mystack, int count, char input, List<Character> temp) {
//		Stack<Character> stack = (Stack<Character>) mystack.clone();
//		temp.add(input);
//		System.out.println(temp.size());
//		if (input == '(') {
//			stack.push(input);
//		}
//		else {
//			if(!stack.isEmpty() && stack.peek() == '(') {
//				stack.pop();
//				if (count == 0 && stack.isEmpty()) {
//					out.add(temp.toString());
//					temp.remove(temp.size() - 1);
//					return;
//				}
//			}
//			else {
//				temp.remove(temp.size() - 1);
//				return;
//			}
//		}
////		backTrack(out, stack, count, ')', temp);
//		if (count > 0) {
//			backTrack(out, stack, count - 1, '(', temp);
//			temp.remove(temp.size() - 1);
//		}
//		backTrack(out, stack, count, ')', temp);
//		temp.remove(temp.size() - 1);
//		System.out.println(temp.size());
//	}
	public List<String> generateParenthesis(int n){
		int left = 0;
		int right = 0;
		String string = "";
		List<String> out = new ArrayList<>();
		backTrack(out, left, right, n, string);
		return out;
	}
	private void backTrack(List<String> out, int left, int right, int n, String string) {
		if (string.length() == 2*n) {
			out.add(string);
			return;
		}
		if (left < n) {
			backTrack(out, left + 1, right, n, string + '(');
		}
		if (right < left) {
			backTrack(out, left, right + 1, n, string + ')');
		}
	}
	public static void main(String arg[]) {
		GenerateParentheses generateParentheses = new GenerateParentheses();
		List<String> out = generateParentheses.generateParenthesis(3);
		System.out.println("--------------------");
		System.out.println(out.size());
		System.out.println(out);
	}
}
