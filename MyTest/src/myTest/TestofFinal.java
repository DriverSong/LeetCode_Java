package myTest;

public class TestofFinal {
	public static void main(String args[]) {
//		String a = "hello2";
//		final String b = "hello";
//		String c = "hello";
//		System.out.println(b + 2);
//		System.out.println(a == b + 2);
//		System.out.println(c + 2);
////		System.out.println(c);
//		System.out.println(a == c + 2);
		String aString = "12345";
		String bString = "12345";
//		System.out.println(aString == bString);
		
		String cString = "123456";
		String dString = "12345"  + 6;
		String eString = aString + 6;
		String eString2 = new String("123456");
		System.out.println(cString == dString);
		System.out.println(cString == eString);
		System.out.println(cString == eString2);
	}
}
