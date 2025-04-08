package Test;

import java.util.Scanner;

public class Q2 {

	    public static boolean isCPrime(int num) {
	        int digits = (int) Math.log10(num) + 1;
	        int temp = num;
	        do {
	            if (!isPrime(temp)) return false;
	            temp = (temp % 10) * (int) Math.pow(10, digits - 1) + (temp / 10);
	        } while (temp != num);
	        return true;
	    }

	    public static boolean isPrime(int num) {
	        if (num < 2) return false;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }

	    public static boolean isXylem(int num) {
	        num = Math.abs(num);
	        int firstDigit = 0, lastDigit = num % 10, middleSum = 0;

	        while (num > 0) {
	            if (num < 10) {
	                firstDigit = num;
	            } else {
	                middleSum += num % 10;
	            }
	            num /= 10;
	        }

	        return (firstDigit + lastDigit) == middleSum;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();

	        if (isCPrime(n)) {
	            System.out.println(n + " is a Circular Prime.");
	        } else {
	            System.out.println(n + " is not a Circular Prime.");
	        }

	        if (isXylem(n)) {
	            System.out.println(n + " is a Xylem Number.");
	        } else {
	            System.out.println(n + " is not a Xylem Number.");
	        }

	        scanner.close();
	    }
	}
