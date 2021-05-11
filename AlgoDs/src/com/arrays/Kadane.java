package com.arrays;
import java.io.*;

public class Kadane {
    
	public static void main (String[] args) throws IOException {
		int n = 5;
        int arr[] = {1,2,3,-2,5};
		System.out.println(maxSubarraySum(arr, n));
	}
    static int maxSubarraySum(int arr[], int n){
        int currentMaxSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < n; i++){
            currentMaxSum = Math.max(arr[i], currentMaxSum+arr[i]);
            maxSum = Math.max(currentMaxSum,maxSum);
        }
        return maxSum;
    }
    
}

