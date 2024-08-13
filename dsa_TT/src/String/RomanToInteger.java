package String;

import java.util.HashMap;

public class RomanToInteger {
	public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int number = 0;
        for(int i=0; i<s.length(); i++){
            if((i+1 <= s.length()-1) && (map.get(s.charAt(i)) < map.get(s.charAt(i+1)))){
                number += map.get(s.charAt(i+1)) - map.get(s.charAt(i));
                i++;
            }
            else{
                number += map.get(s.charAt(i));
            }
        }
        return number;
 

////Faster Approach
    // int value(char r)   
    // {   
    //     if (r == 'I')   
    //         return 1;   
    //     if (r == 'V')   
    //         return 5;   
    //     if (r == 'X')   
    //         return 10;   
    //     if (r == 'L')   
    //         return 50;   
    //     if (r == 'C')   
    //         return 100;   
    //     if (r == 'D')   
    //         return 500;   
    //     if (r == 'M')   
    //         return 1000;   
    //     return -1;   
    
    // }   
    // public int romanToInt(String s) {
    //     int total = 0;   
    //     for (int i=0; i<s.length(); i++)   
    //     {   
    //         int s1 = value(s.charAt(i)); 
    //         if (i+1 <s.length())   
    //         {   
    //             int s2 = value(s.charAt(i+1));    
    //             if (s1 >= s2)   
    //                 total = total + s1;  
    //             else  
    //                 total = total - s1;   
    //         }   
    //         else
    //             total = total + s1;
    //     }   

    //     return total;
    // }
	
	}
	
	public static void main(String[] args) {
		
	}
}
