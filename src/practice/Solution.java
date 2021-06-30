package practice;

import java.util.Scanner;

public class Solution {

	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int num = inp.nextInt();
		int arr[] = new int[num];

		System.out.println("Enter the numbers of array now");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = inp.nextInt();
		}

		Solution s = new Solution();
		System.out.println("The solution is " + s.solution(arr));
		inp.close();
	}

	public int solution(int[] A) {
		int count=0;
		
			
				return count;
			
	}

}
