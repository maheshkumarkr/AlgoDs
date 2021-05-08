package com.arrays;

public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 3, 7, 8, 6, 2, 1};
		int n = arr.length;
		boolean lessFlag = true; // initial order <
        for (int i = 0;i < n-1;i++) {
            if (lessFlag) { // <
                if (arr[i] > arr[i+1]) {
                    // do swap
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
                lessFlag = false;
            } else { // >
                if (arr[i] < arr[i+1]) {
                    // do swap
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
                lessFlag = true;
            }
        }
        for (int j = 0; j < n - 1; j++) {
        	System.out.print(arr[j]+" ");
        }
        System.out.println(arr[n-1]);
	}

}
