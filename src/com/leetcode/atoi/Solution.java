package com.leetcode.atoi;

public class Solution {
    public int myAtoi(String str) {
        int result = 0;
        boolean minus = false;
        boolean firstspace = true;
        for(int i=0;str!=null && i<str.length();i++){
            char c = str.charAt(i);
            if(firstspace){
                if(c==' ' || c=='\t')   continue;
                else if(c=='+') continue;
                else if(c=='-'){
                    minus = true;
                    firstspace = false;
                } 
                else if(c<'0' || c>'9') break;
            }
            if(c>='0' && c<='9'){
                firstspace = false;
                if((long)result*10 > Integer.MAX_VALUE)
                    result = (minus) ? Integer.MIN_VALUE:Integer.MAX_VALUE;
                result *=10;
                result += (c - '0');
            } else if (!firstspace)     break;
        }
        
        if(minus)   result *= -1;
        return result;
    }
}
