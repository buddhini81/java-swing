/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author buddhini
 */
public class Processor {
    
    public static String[] findVowelWords(String str) {
        char[] vowels = new char[]{'a','e','i','o','u'};
        
        String[] words = str.split(" ");
        
        List<String> vowelWords = new ArrayList<String>();
        
        for(int i = 0; i < words.length; i++) {
            for(int j =0; j < vowels.length; j++) {
                String wordToCheck = words[i].replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
                if(wordToCheck.startsWith(String.valueOf(vowels[j]))) {
                    vowelWords.add(wordToCheck);
                }
            }
        }
        
        return vowelWords.toArray(new String[0]);
    }
}
