package org.example;

public class ReverseInteger{

    public int reverseInteger(int input){
        long value = 0;
        while(input !=0){
//            System.out.println(value);
            value = value * 10 + input % 10;
            input /= 10;
            if(value>Integer.MAX_VALUE || value<Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int) value;
    }
        }
