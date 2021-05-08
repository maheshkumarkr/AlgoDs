package com.string;

import java.util.Arrays;

public class LongestDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "asdfasdf";
		//aldshflasghdfasgfkhgasdfasdgvfyweofyewyrtyefgv
		System.out.println(longestSubstrDitinctChars(S));
	}
	static int longestSubstrDitinctChars(String S){
        // code here
		int n = S.length();		 
        int res = 0;
        int [] lastIndex = new int[256];
        Arrays.fill(lastIndex, -1);
        int i = 0;
        // Sliding Window technique -- to keep track of lastIndex of each character -- for above example - we keep track of w
        for (int j = 0; j < n; j++) {
            i = Math.max(i, lastIndex[S.charAt(j)] + 1);
            res = Math.max(res, j - i + 1);
            lastIndex[S.charAt(j)] = j;
        }
        return res;
    }
}
