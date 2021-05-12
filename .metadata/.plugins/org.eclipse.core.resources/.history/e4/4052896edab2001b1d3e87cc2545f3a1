package com.string;

public class ImplementAtoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "-12";
		System.out.println(atoi(str));
	}
	static int atoi(String str)
    {
	// Your code here
		int n = str.length();
	    int result = 0;
	    boolean negativeNum = false;
	    for (int i = 0; i < n - 1; i++) {
	        try {
	            if (str.charAt(i) == '-') {
	                negativeNum = true;
	                continue;
	            }
	            result += Integer.parseInt(str.charAt(i)+"");
	            result *= 10;
	        } catch (Exception e) {
	            return -1;
	        }
	    }
	    result += Integer.parseInt(str.charAt(n-1)+"");
	    if (negativeNum){
	        return result * (-1);   
	    } else {
	        return result;
	    }
    }
}
