package Recursion;

//import java.io.*;
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
// 
//        // Reading N and K
//        String str = bufferedReader.readLine().trim();
//        int n = Integer.parseInt(str);
//        
//        Solution solution = new Solution();
//        ArrayList<Integer> result = solution.perfect(n);
//        System.out.println(result);
//    }
//}
//
//class Solution {
//   
//    public static boolean isPerfect(int num) {
//        int sum = getDivisorSum(num, 1);
//        return sum == num;
//    }
//
//    public static int getDivisorSum(int num, int divisor) {
//        if (divisor >= num) {
//            return 0;
//        }
//
//        if (num % divisor == 0) {
//            return divisor + getDivisorSum(num, divisor + 1);
//        } else {
//            return getDivisorSum(num, divisor + 1);
//        }
//    }
//
//
// public ArrayList<Integer> perfect(int n) {
//     ArrayList<Integer> ans = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            if (isPerfect(i)) {
//                ans.add(i);
//            }
//        }
//        return ans;
//    }
//}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public String convertOctalToHexadecimal(int octalNumber) {
        
        int decimalNumber = 0;
        int base = 1;
        while (octalNumber != 0) {
            int remainder = octalNumber % 10;
            decimalNumber += remainder * base;
            base *= 8;
            octalNumber /= 10;
        }

        
        StringBuilder hexadecimalNumber = new StringBuilder();
        while (decimalNumber != 0) {
            int remainder = decimalNumber % 16;
            if (remainder < 10) {
                hexadecimalNumber.insert(0, remainder);
            } else {
                char hexDigit = (char) ('A' + (remainder - 10));
                hexadecimalNumber.insert(0, hexDigit);
            }
            decimalNumber /= 16;
        }

        return hexadecimalNumber.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Reading octal number
        String octalString = bufferedReader.readLine().trim();
        int octalNumber = Integer.parseInt(octalString);

        Main solution = new Main();
        String hexadecimalResult = solution.convertOctalToHexadecimal(octalNumber);
        System.out.println(hexadecimalResult);

        bufferedReader.close();
    }
}

