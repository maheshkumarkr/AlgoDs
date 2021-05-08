package com.arrays;
//Initial Template for Java

import java.io.*;
import java.util.*;

class CountTriplets {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            System.out.println(countTriplet(arr, n));
        }
    }
    static int countTriplet(int arr[], int n) {
        // code here
        
        Arrays.sort(arr);
        int count = 0;
        for (int i = n-1; i > 0; i--){
            int k = i-1;
            int j = 0;
            while(j < k) {
                if(arr[j]+arr[k] == arr[i]){
                    count++;
                    j++;
                    k--;
                } else if (arr[j]+arr[k] < arr[i]) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return count;
    }
}