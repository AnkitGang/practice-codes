package Recursion;

import java.util.ArrayList;

public class Permutation {
	
	public static ArrayList<String> getPerm(String str){
		if(str.length() == 0) {
			ArrayList<String> l = new ArrayList<>();
			l.add("");
			return l;
		}
		
		char firstChar = str.charAt(0);
		
		ArrayList<String> finalList = new ArrayList<>();
		
		//Permutation of small
 		ArrayList<String> result = getPerm(str.substring(1));  //result stores the previous answer
		
 		//traverse the result
		for(String t : result) {    //this is the arraylist 
			for(int i=0; i <= t.length(); i++) {
				StringBuilder sb = new StringBuilder(t);
				sb.insert(i, firstChar);
				finalList.add(sb.toString());
			}
		}
		return finalList;
	}
	
	public static void getPerm(String str, String res) {
		if(str.length() == 0) {
			System.out.println(res);
			return ;
		}
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(getPerm("abc"));
	}
}
