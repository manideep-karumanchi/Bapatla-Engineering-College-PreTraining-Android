import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {

    public static void main(String[] args) {
		
		String s = "abcxabcxxabcxa",longSubString="";
		int strLength = s.length();
		if (s.substring(0, strLength/2).equals(s.substring(strLength/2, strLength))) {
			longSubString = s.substring(0, strLength/2);
		}
		else{
			for (int i = 1; i < strLength; i++) {
				if (s.substring(0, i).equals(s.substring(strLength-i, strLength) )) {
					longSubString = s.substring(0, i);
				}
			}
		}
		System.out.println("Longest Substring is:"+longSubString);
    }
}