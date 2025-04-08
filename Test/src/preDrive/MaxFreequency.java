package preDrive;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxFreequency{
    public static void main(String[] args) {
    	System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Original text:");
        System.out.println(str);

        String maxFrequencyWord = findMaxFrequencyWord(str);
        System.out.println("\nWord with maximum frequency:");
        System.out.println(maxFrequencyWord);
    }

    public static String findMaxFrequencyWord(String text) {
        
        text = text.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");
        
        String[] words = text.split("\\s+");

        Map<String, Integer> wordFrequencies = new HashMap<>();

        
        for (String word : words) {
            if (wordFrequencies.containsKey(word)) {
                wordFrequencies.put(word, wordFrequencies.get(word) + 1);
            } else {
                wordFrequencies.put(word, 1);
            }
        }

        String maxFrequencyWord = "";
        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxFrequencyWord = entry.getKey();
            }
        }

        return maxFrequencyWord + " (" + maxFrequency + " times)";
    }
}
