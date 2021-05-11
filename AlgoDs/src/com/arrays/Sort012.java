package com.arrays;

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,0,2,0};
		int n = 5;
		sort012(arr,n);
		System.out.println("Sort in Place (with Swap technique)");
		for (int i = 0; i<n-1; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println(arr[n-1]);
		System.out.println("Sort012 with Counter Technique");
		sort012ByCounter(arr, n);
	}
	static void sort012(int[] arr, int n) {
		int lo = 0;
        int hi = n - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            switch (arr[mid]) {
	            case 0:
	                temp = arr[lo];
	                arr[lo] = arr[mid];
	                arr[mid] = temp;
	                lo++;
	                mid++;
	                break;
	            case 1:
	                mid++;
	                break;
	            case 2:
	                temp = arr[mid];
	                arr[mid] = arr[hi];
	                arr[hi] = temp;
	                hi--;
	                break;
            }
        }
	}
	static void sort012ByCounter(int[] arr, int n){
		int cnt0 = 0, cnt1 = 0, cnt2=0;
		for(int i = 0; i < n; i++){
			switch(arr[i]) {
				case 0:
					cnt0++;
					break;
				case 1:
					cnt1++;
					break;
				case 2:
					cnt2++;
					break;
			}
		}
		for (int j = 0; j < n; j++){
			while(cnt0 > 0){
				System.out.print(0+" ");
				cnt0--;
			}
			while(cnt1 > 0) {
				System.out.print(1+" ");
				cnt1--;
			}
			while(cnt2 > 0){
				System.out.print(2+" ");
				cnt2--;
			}
		}
	}
}
