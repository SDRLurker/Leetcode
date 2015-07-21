package com.leetcode.roman;

public class Solution {
    public int romanToInt(String s) {
        int number = 0;
        boolean istart = false, vstart = false;
        boolean xstart = false, lstart = false;
        boolean cstart = false, dstart = false;
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case 'M':
                    if(cstart){
                        number += 800;
                        cstart = false;
                    } else {
                        number += 1000;
                    }
                    break;
                case 'D':
                    if(cstart){
                        number += 400;
                        cstart = false;
                    } else {
                        dstart = true;
                        number += 500;    
                    }
                    break;
                case 'C':
                    if(xstart){
                        number += 90;
                        xstart = false;
                    } else {
                        if(!cstart)     
                            cstart = true;
                        number += 100;
                    }
                    break;
                case 'L':
                    if(xstart){
                        number += 40;
                        xstart = false;
                    } else {
                        lstart = true;
                        number += 50;
                    }
                    break;
                case 'X':
                    if(istart){
                        number += 9;
                        istart = false;
                    } else {
                        if(!xstart)     
                            xstart = true;
                        number += 10;
                    }
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
                case 'I':
                    if(!istart)     
                        istart = true;
                    number++;
                    break;

            }
        }
        return number;
    }
}
