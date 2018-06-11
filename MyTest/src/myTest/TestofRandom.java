package myTest;

import java.util.Arrays;

public class TestofRandom {
	private static final String[] hex =  {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
	
	public static void main(String arg[]) {
//		double a = Math.random();//[0, 1)
//		double b = a * 256;
//		byte c = (byte) b;//byte有正负，-2^7 ~ 2^7-1
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 16; i++) {
			int index = (int)(Math.random() * 16);
			sb.append(hex[index]);
		}
		String out = sb.toString();
		byte[] outBytes = out.getBytes();
		String[] hexs = new String[outBytes.length * 2];
		for(int i = 0; i < outBytes.length; i++) {
			hexs[i * 2] = hex[(outBytes[i] >>> 4) & 0xf];
			hexs[i * 2 + 1] = hex[outBytes[i] & 0xf];
		}
		System.out.println(out);
		System.out.println(Arrays.toString(outBytes));
		System.out.println(Arrays.toString(hexs));
	}
}
