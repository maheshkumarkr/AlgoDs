package com.string;

public class ImplementStrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeforksforforgeeks";
        //System.out.println(s2.indexOf("for"));
        System.out.println(strstr(s,"for"));
	}
	static int strstr(String s, String x){
		int counter = 0; //pointing x
	       int i = 0;
	       for(;i<s.length();i++){
	            if(counter==x.length())
	                break;
	            if(x.charAt(counter)==s.charAt(i)){
	                counter++;
	            }else{
	                //Special case where character preceding the i'th character is duplicate
	                //if(counter>0){
	                //    i -= counter;
	                //}
	                counter = 0;
	            }
	        }
	       return counter < x.length()?-1:i-counter;
    }
}
