package com.shao.study.arithmetic.example;

import org.springframework.boot.SpringBootConfiguration;

/**
 * @ClassName StingSolution
 * @Description TOO 有关字符串的一些算法问题
 * @Author 邵亨鹏
 * @Date 2020/4/24 17:23
 * @Version 1.0
 **/
public class StingSolution {

    public int lengthOfLongestSubstring(String str){
        int n = str.length();
        int ans = 0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<=n;j++){
                System.out.println(str.substring(i,j));
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        StingSolution stingSolution = new StingSolution();
        stingSolution.lengthOfLongestSubstring("abcde");
    }
}
