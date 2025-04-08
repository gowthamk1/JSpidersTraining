package Test;

import java.util.Scanner;

public class Q3 {
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static boolean isArmstrong(int num) {
        int o = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == o;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean prime = isPrime(num);
        boolean armstrong = isArmstrong(num);

        if (prime && armstrong) {
            System.out.println(num + " is both a Prime & Armstrong.");
        } else if (prime) {
            System.out.println(num + " is a Prime not Armstrong.");
        } else if (armstrong) {
            System.out.println(num + " is Armstrong not Prime.");
        } else {
            System.out.println(num + " is neither Prime nor Armstrong.");
        }

        scanner.close();
    }
}

