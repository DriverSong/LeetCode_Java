package leetcode;

import java.util.LinkedList;
import java.util.Stack;

public class CherryPickup {
	public int cherryPickup(int[][] grid) {
        int step_row = 0;
        int step_col = 0;
        int size = grid.length;
        //初始化全零数组
        int[][] timeOfBack = new int[size][size];
        int[][] lastStep = new int[size][size];
        for(int j = 0; j < size; j++) {
        	for (int k = 0; k < size; k++) {
				if (j == size -1 && k == size -1) {
					continue;
				}
				if (j == size-1) {
					timeOfBack[j][k]++;
					if (grid[j][k+1] == -1) {
						timeOfBack[j][k]++;
						continue;
					}
				}
				if (k == size -1) {
					timeOfBack[j][k]++;
					if (grid[j+1][k] == -1) {
						timeOfBack[j][k]++;
						continue;
					}
				}
				if (grid[j+1][k] == -1) {
					timeOfBack[j][k]++;
				}
				if (grid[j][k+1] == -1) {
					timeOfBack[j][k]++;
				}
			}
        }
        /*
         * the direction is contained in a Stack,
         * 0---------------->right
         * 1---------------->left
         */
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for(i = 0; i < 2*size; i++) {
        	if (timeOfBack[step_row][step_col] == 2) {
				if(i == 0) return 0;
				timeOfBack[step_row][step_col]++;
				i--;
				int temp = stack.pop();
				if (temp == 0) {
					step_col--;
				}else {
					step_row--;
				}
			}
        	if (timeOfBack[step_row][step_col] == 1) {
				if (step_row == size -1) {
					stack.push(0);
					step_col++;
				}else if (step_col == size - 1) {
					stack.push(1);
					step_row++;
				}else {
					
				}
			}
        	if(step_col == 0 && step_row == 0)
        	if (grid[step_row+1][step_col] == -1 && grid[step_row][step_col+1] == -1) {
        		if ((step_col+step_row) == 1) {
					return 0;
				}
				int temp = stack.pop();
				i--;
				if (temp == 1) {
					
				}
			}
        }
    }
}
