package org.example;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int toInteger(String roman){

        Map<Character,Integer> map = new HashMap();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int output = 0;
        for(int i =0; i < roman.length(); i++ ){
            if(i>0 && map.get(roman.charAt(i)) > map.get(roman.charAt(i-1))){
                output += map.get(roman.charAt(i)) - 2 * map.get(roman.charAt(i - 1));
            }else {
                output = output + map.get(roman.charAt(i));
            }
        }
        return output;
    }

}
