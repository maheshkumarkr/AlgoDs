package com.arrays;

public class RearrangeArrays {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6};
		int arr2[] = {1,2,3,4,5,6};
		System.out.println("Result with Extra Space");
		withExtraSpace(arr1);
		System.out.println("Result without Extra Space");
		withoutExtraSpace(arr2);
	}
	static void withExtraSpace(int[] arr) {
		int tmpArr[] = arr.clone();
		int n = arr.length;
		int small = 0;
		int large = n - 1;
		boolean flag = true;
		for (int i = 0; i < n ; i++) {
			if (flag)
				arr[i] = tmpArr[large--];
			else
				arr[i] = tmpArr[small++];
			flag = !flag;
		}
		
        for (int j = 0; j < n - 1; j++) {
        	System.out.print(arr[j]+" ");
        }
        System.out.println(arr[n-1]);
	}
	static void withoutExtraSpace(int[] arr) {
		int n = arr.length;
		int max_index = n - 1;
		int min_index = 0;
		
		int max_val = arr[n-1] + 1;
		
		for(int i = 0; i < n; i++){
			if (i % 2 == 0)
				arr[i] += (arr[max_index--]% max_val)*max_val;
			else
				arr[i] += (arr[min_index++]% max_val)*max_val;
		}
		for (int i = 0; i < n - 1; i++) {
			arr[i] /= max_val;
			System.out.print(arr[i]+ " ");
		}
		arr[n-1]/= max_val;
		System.out.println(arr[n-1]);
		
	}
}
