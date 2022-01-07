package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        String str = "nitin";
        System.out.println(str.toCharArray());
        int ans = search(str, 'i');
        System.out.println(ans);
    }

    static int search(String str, char target) {
        if (str.length() == 0) {
            return -1;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == target) {
                    return i;
                }
            }
            return -1;
        }
    }
}
// this program will have the time complexity of o(n)
// this program will have the space complexity of o(1)