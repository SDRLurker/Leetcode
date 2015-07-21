package com.leetcode.roman;

public class Solution {
    private class RomanDic {
        private String roman;
        private int arabic;
        public RomanDic(String roman, int arabic) {
            this.roman = roman;
            this.arabic = arabic;
        }
    }
    private final RomanDic[] table = {
        new RomanDic("MMM", 3000),
        new RomanDic("MM", 2000),
        new RomanDic("CM", 900),
        new RomanDic("M", 1000),
        new RomanDic("DCCC", 800),
        new RomanDic("DCC", 700),
        new RomanDic("DC", 600),
        new RomanDic("CD", 400),
        new RomanDic("D", 500),
        new RomanDic("CCC", 300),
        new RomanDic("CC", 200),
        new RomanDic("XC", 90),
        new RomanDic("C", 100),
        new RomanDic("LXXX", 80),
        new RomanDic("LXX", 70),
        new RomanDic("LX", 60),
        new RomanDic("XL", 40),
        new RomanDic("L", 50),
        new RomanDic("XXX", 30),
        new RomanDic("XX", 20),
        new RomanDic("IX", 9),
        new RomanDic("X", 10),
        new RomanDic("VIII", 8),
        new RomanDic("VII", 7),
        new RomanDic("VI", 6),
        new RomanDic("IV", 4),
        new RomanDic("V", 5),
        new RomanDic("III", 3),
        new RomanDic("II", 2),
        new RomanDic("I", 1)
    };

    public int romanToInt(String s) {
        int arabic_num = 0;
        StringBuffer sb = new StringBuffer(s);
        for (RomanDic r: table) {
            //if (s.indexOf(r.roman) >= 0) {
            int start = sb.indexOf(r.roman);
            if (start >= 0) {
                arabic_num += r.arabic;
                //s = s.replace(r.roman, "");
                sb.replace(start, start+r.roman.length(), "");
            }
        }
        return arabic_num;     
    }
}
