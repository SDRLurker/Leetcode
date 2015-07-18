package com.leetcode.zigzag;

public class Solution {
    public String convert(String s, int numRows) {
        StringBuffer sb = new StringBuffer();
        int pluses[] = new int[] {(numRows-1)*2, 0};
        if(numRows == 1)    pluses[0] = 1;
        for(int i=0;i<numRows;i++) {
            int cur_idx = i, pi=0;
            while(cur_idx<s.length()) {
                sb.append(s.charAt(cur_idx));
                if(pluses[pi] > 0) {
                    cur_idx += pluses[pi++];
                    if(pi % 2 == 0) pi=0;
                    if(pluses[pi]==0)   pi=0;
                } else {
                    if(pluses[++pi]>0){
                        cur_idx += pluses[pi];
                        pi=0;
                    } else break;
                }
                if(pi % 2 == 0) pi=0;
            }
            pluses[0] -= 2;
            pluses[1] += 2;
        }
        return sb.toString();
    }
}
