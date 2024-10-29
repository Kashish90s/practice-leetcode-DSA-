package org.example;

public class Palindeome {

    public String stringPalindrome(String input){
        StringBuilder reverseString = new StringBuilder();
        for(int i = input.length()-1; i >= 0;i--){
            reverseString.append(input.charAt(i));
        }
        if(reverseString.toString().toLowerCase().equals(input.toLowerCase())){
            return "It is a Palindrome";
        }
        return "Not a Palindrome";
    }
}
