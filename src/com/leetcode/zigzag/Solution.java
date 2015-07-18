package com.leetcode.zigzag;

public class Solution {
    public String convert(String s, int numRows) {
        StringBuffer sb = new StringBuffer();
        int pluses[] = new int[] {(numRows-1)*2, 0};
        for(int i=0;i<numRows;i++) {
            int cur_idx = i, pi=0;
            while(cur_idx<s.length()) {
                sb.append(s.charAt(cur_idx));
                if(pluses[pi] > 0) {
                    cur_idx += pluses[pi++];
                    if(pluses[pi]==0)   pi=0;
                } else {
                    if(pluses[++pi]>0){
                        cur_idx += plus[pi];
                        // Line 14: error: cannot find symbol: variable plus
                        // pluses여야 하는데 plus로 작성하였음.
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
