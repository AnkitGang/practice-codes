package String;

import java.util.ArrayList;

public class subSequence {

	public static ArrayList<String> getAllSubSequence(String str) {
		// Small Problem (MAke a string small)
		if (str.length() == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}

		char firstChar = str.charAt(0);
		ArrayList<String> result = new ArrayList<>();
		ArrayList<String> list = getAllSubSequence(str.substring(1));

		for (String s : list) {
			// Not include it
			result.add(s);
			// Include it
			result.add(firstChar + s);
		}

		return result;
	}
	
	private static void printSubSequences(String str) {
		ArrayList<String> subSeqList = new ArrayList<>();

        int n = str.length();
        for(int i=0;i<n;i++){
            char firstChar = str.charAt(i);
            if(subSeqList.size() == 0){
                subSeqList.add(" ");
                subSeqList.add("" + firstChar);
                continue;
            }
            int subLen = subSeqList.size();
            for(int j=0;j<subLen;j++){
                String temp = subSeqList.get(j) + firstChar;
                subSeqList.add(temp);
            }
        }

        System.out.println(subSeqList);
	}

	public static void main(String[] args) {
		ArrayList<String> result = getAllSubSequence("amit");
		System.out.println("subSequence List of amit: ");
		System.out.println(result);
		
		String str = "abcd";
		System.out.println();
		System.out.println("subSequence List of abcd: ");
		printSubSequences(str);
	}
}

