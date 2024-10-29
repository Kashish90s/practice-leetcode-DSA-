package org.example;

public class LongestSubStringPalindrome {
    int resultLength;
    int resultStart;
    public String longestpalindrome(String input){
        if(input.length() < 2){
            return input;
        }
        for(int start = 0; start < input.length()-1;start++ ){
            checkPalindrome(input,start,start);
            checkPalindrome(input,start,start+1);
        }
        return input.substring(resultStart,resultStart+resultLength);
    }
    private void checkPalindrome(String str,int begin,int end){
        while(begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)){
            begin--;
            end++;
        }
        if(resultLength < end - begin - 1){
            resultStart = begin +1;
            resultLength = end - begin -1;
        }
    }
}
