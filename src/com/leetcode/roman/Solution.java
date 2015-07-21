package com.leetcode.roman;

public class Solution {
    public int romanToInt(String s) {
        int number = 0;
        boolean istart = false, vstart = false;
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case 'M':
                    number += 1000;
                    break;
                case 'D':
                    number += 500;
                    break;
                case 'C':
                    number += 100;
                    break;
                case 'L':
                    number += 50;
                    break;
                case 'I':
                    if(!istart)     
                        istart = true;
                    number++;
                    break;
                case 'V':
                    if(istart){
                       number += 4;
                       istart = false;
                    } else {
                        vstart = true;
                        number += 5;
                    }
                    break;
                case 'X':
                    if(istart){
                        number += 9;
                        istart = false;
                    } else {
                        number += 10;
                    }
                    break;
            }
        }
        return number;
    }
}
