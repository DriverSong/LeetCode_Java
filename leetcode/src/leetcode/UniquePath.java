package leetcode;

public class UniquePath {
	public int uniquePaths(int m, int n) {
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        for(int i = 0; i < m; i++) {
        	if(i == 0) {
        		for(int j = 0; j < n; j++) {
        			array1[j] = 1;
        			array2[j] = 0;
        		}
        	}else {
        		for(int j = 0; j < n; j++) {
        			for(int k = 0; k <= j; k++) {
        				array2[j] += array1[k];
        			}
        		}
        		for(int j = 0; j < n; j++) {
        			array1[j] = array2[j];
        			array2[j] = 0;
        		}
        	}
        }
        return array1[n - 1];
    }
	public static void main(String arg[]) {
		UniquePath object1 = new UniquePath();
		int result = object1.uniquePaths(7, 3);
		System.out.println(result);
	}
}
