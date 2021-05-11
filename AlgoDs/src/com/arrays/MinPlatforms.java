package com.arrays;

import java.util.Arrays;

public class MinPlatforms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {900, 940, 950, 1100, 1500, 1800};
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
		int n = 6;
		System.out.println(findPlatform(arr,dep,n));
	}
	static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int plat_Count = 1;
        int max_Plat = 1;
        int i = 1, j = 0;
        
        while (i < n && j < n) {
            if (arr[i] <= dep[j]){
                plat_Count++;
                i++;
            } else if (arr[i] > dep[j]) {
                plat_Count--;
                j++;
            }
            max_Plat = Math.max(max_Plat,plat_Count);
        }
        return max_Plat;
    }
}
