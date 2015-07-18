package com.leetcode.reverse_integer;

public class Solution {
    public int reverse(int x) {
        long r=0;
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
        // Line 18: Type mismatch: cannot convert from long to int
        // 리턴은 int형인데 long형 변수를 리턴함.
    }
}
