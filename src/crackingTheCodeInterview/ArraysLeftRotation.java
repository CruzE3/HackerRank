package crackingTheCodeInterview;

import java.util.*;

public class ArraysLeftRotation {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }	
        in.close();
        
        int[] rotatedA = rotate(a, k);
        for (int num : rotatedA) {
        	System.out.printf("%d ", num);
        }
        System.out.println();
	}
	
	public static int[] rotate(int[] nums, int numberOfRotations) {
		if (nums.length == 0) { return nums; } // Nothing to do
		int nums0;
		for (int i = 0; i < numberOfRotations; i++) {
			nums0 = nums[0];
			for (int j = 1; j < nums.length; j++) {
				nums[j-1] = nums[j];
			}
			nums[nums.length-1] = nums0;
		}
		return nums;
	}
}
