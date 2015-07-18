package com.leetcode.reverse_integer;

public class Solution {
    public int reverse(int x) {
        int r=0;
        int xx=x;
        boolean minus = false;
        if(x<0){
            minus = true;
            xx = -x;
        }
        while(xx>0){
            r *= 10;
            r += xx%10;
            xx /= 10;
        }
        if(minus){
            r *= -1;
        }
        return r;
    }
}
