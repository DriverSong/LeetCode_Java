package leetcode;

import java.lang.Byte;

public class ReverseBits {
	public int reverseBits(int n) {
        int length = 32;
        int intReverse = 0;
        Byte[] bytes = new Byte[length];
        for(int i = 0; i < length; i++) {
        	bytes[i] = (byte)((n>>i) & 1);
        }
        for(int i = 0; i < length/2; i++) {
        	bytes[i] = (byte) (bytes[length - 1 - i] ^ bytes[i]);
        }
        for(int i = 0; i < length/2; i++) {
        	bytes[length - 1 - i] = (byte) (bytes[length - 1 - i] ^ bytes[i]);
        }
        for(int i = 0; i < length/2; i++) {
        	bytes[i] = (byte) (bytes[length - 1 - i] ^ bytes[i]);
        }
        for(int i = 0; i < length; i++) {
        	intReverse = intReverse | (bytes[i] << i);
        }
        return intReverse;
    }
}
