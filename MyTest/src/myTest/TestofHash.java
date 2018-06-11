package myTest;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

public class TestofHash {
	public static void main(String args[]) {
		String input  = "aaa";
		byte[] inputBytes = null;
		String output = "";
		try {
			inputBytes = input.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			mdInst.update(inputBytes);
			byte[] md = mdInst.digest();
			int length = md.length;
			for(int i = 0; i < length; i++) {
				byte tempByte = md[i];
				String hex1 = Integer.toHexString((int)(tempByte & 0xF));
				tempByte  = (byte) (tempByte >>> 4);
				String hex2 = Integer.toHexString((int)(tempByte & 0xF));
				output = output + hex2 + hex1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(output);
	}
}
