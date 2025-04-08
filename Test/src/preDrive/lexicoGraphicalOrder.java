package preDrive;

import java.util.Arrays;
import java.util.Scanner;


public class lexicoGraphicalOrder {
    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Before string:");
        System.out.println(str);

        String sortedString = sortString(str);
        System.out.println("\nAfter string:");
        System.out.println(sortedString);
    }

    public static String sortString(String str) {
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);

        return sortedString;
    }
}
