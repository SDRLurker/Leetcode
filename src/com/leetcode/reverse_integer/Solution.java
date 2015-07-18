package com.leetcode.reverse_integer;

public class Solution {
    public int reverse(int x) {
        int r=0;
        long rr=0L;
        int xx=x;
        boolean minus = false;
        if(x<0){
            minus = true;
            xx = -x;
        }
        while(xx>0){
            rr *= 10;
            rr += xx%10;
            if(rr>Integer.MAX_VALUE){
                rr = 0;
                break;
            }
            xx /= 10;
        }
        r = (int)rr;
        if(minus){
            r *= -1;
        }
        return r;
    }
}

