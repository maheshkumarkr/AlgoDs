package com.arrays;
import java.util.Arrays;
import java.util.List;

public class ReverseInGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(1,2,3,4,5);
		reverseInGroups(arr,arr.size(),3);
		System.out.println(arr);
	}
	static void reverseInGroups(List<Integer> arr, int n, int k) {
        // code here
        for(int i=0;i<n;i+=k){
            int left = i;
            int right = Math.min(i+k-1,n-1);
            while(left<right){
                int temp=arr.get(left);
                arr.set(left,arr.get(right));
                arr.set(right,temp);
                left++;
                right--;
            }
        }
    }
}
