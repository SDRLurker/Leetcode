package com.leetcode.reverse_integer;

public class Solution {
    public int reverse(int x) {
        int r=0;
        int xx=x;
        if(x<0)
            xx = -x;
        while(xx>0){
            if(r>Integer.MAX_VALUE/10){
                r = 0;
                break;
            }
            r *= 10;
            r += xx%10;
            xx /= 10;
        }
        if(x<0)
            r *= -1;
        return r;
    }
}

