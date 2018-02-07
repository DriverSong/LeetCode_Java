package leetcode;

public class RotateImage {
	public void rotate(int[][] matrix) {
        int size = matrix.length;
        double N = Math.ceil(((double)size)/2);
        System.out.println(N);
        if (N - ((double)size)/2 > 0) {
        	for(int i = 0; i < N; i++) {
            	for(int j = 0 ; j < N - 1; j++) {
            		//////////////////////
            		matrix[i][j] ^= matrix[size-1-j][i];
            		matrix[size-1-j][i] ^= matrix[i][j];
            		matrix[i][j] ^= matrix[size-1-j][i];
            		//////////////////////
            		matrix[size-1-j][i] ^= matrix[size-1-i][size-1-j];
            		matrix[size-1-i][size-1-j] ^= matrix[size-1-j][i];
            		matrix[size-1-j][i] ^= matrix[size-1-i][size-1-j];
            		//////////////////////
            		matrix[size-1-i][size-1-j] ^= matrix[j][size-1-i];
            		matrix[j][size-1-i] ^= matrix[size-1-i][size-1-j];
            		matrix[size-1-i][size-1-j] ^= matrix[j][size-1-i];
            		/////////////////////
//            		matrix[j][size-1-i] ^= matrix[i][j];
//            		matrix[i][j] ^= matrix[j][size-1-i];
//            		matrix[j][size-1-i] ^= matrix[i][j];
            	}
            }
        }else {
        	for(int i = 0; i < N; i++) {
            	for(int j = 0 ; j < N; j++) {
            		//////////////////////
            		matrix[i][j] ^= matrix[size-1-j][i];
            		matrix[size-1-j][i] ^= matrix[i][j];
            		matrix[i][j] ^= matrix[size-1-j][i];
            		//////////////////////
            		matrix[size-1-j][i] ^= matrix[size-1-i][size-1-j];
            		matrix[size-1-i][size-1-j] ^= matrix[size-1-j][i];
            		matrix[size-1-j][i] ^= matrix[size-1-i][size-1-j];
            		//////////////////////
            		matrix[size-1-i][size-1-j] ^= matrix[j][size-1-i];
            		matrix[j][size-1-i] ^= matrix[size-1-i][size-1-j];
            		matrix[size-1-i][size-1-j] ^= matrix[j][size-1-i];
            		/////////////////////
//                		matrix[j][size-1-i] ^= matrix[i][j];
//                		matrix[i][j] ^= matrix[j][size-1-i];
//                		matrix[j][size-1-i] ^= matrix[i][j];
            	}
            }
		}
    }
	public static void main(String arg[]) {
		int a = 90;
		int b = 91;
		a ^= b;
		b ^= a;
		a ^= b;
		System.out.println(a);
		System.out.println(b);
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		RotateImage rotateImage = new RotateImage();
		rotateImage.rotate(matrix);
		System.out.println(matrix[0][0]);
	}
}
