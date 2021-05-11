package com.arrays;

public class EquilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		long arr[] = {1,3,5,2,2};
		System.out.println(eqPoint(arr,n));
	}
	public static int eqPoint(long arr[], int n) {

        // Your code here
        long sum = 0;
        for(int i = 0; i < n ; i++) {
            sum += arr[i];
        }
        long leftSum = 0;
        for (int j = 0; j < n; j++) {
            sum -= arr[j];
            if (sum == leftSum)
                return j+1;
            leftSum += arr[j];
        }
        return -1;
    }
}
