package com.string;

import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "gfg";
		System.out.println(removeDups(S));
	}
	static String removeDups(String S) {
        // code here
		StringBuilder result = new StringBuilder("");
        LinkedHashSet<Character> noDuplicateSet = new LinkedHashSet<>();
        for(int i = 0; i < S.length(); i++){
        	noDuplicateSet.add(S.charAt(i));
        }
        for(Character e:noDuplicateSet){
        	result.append(e+"");
        }
        return result.toString();
    }
}
