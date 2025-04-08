package Sorting;

import java.util.Arrays;


public class QuickSort {
    public int Partition(int[] a, int si, int ei) {
        int pivot = a[ei]; // Set pivot as the last element
        int i = si - 1; // Initialize i one position before the start

        for (int j = si; j < ei; j++) {
            if (a[j] <= pivot) {
                i++;
                // Swap a[i] and a[j]
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        // Place pivot in the correct position
        int temp = a[i + 1];
        a[i + 1] = a[ei];
        a[ei] = temp;

        return i + 1; // Return the pivot index
    }

    public void Quicksort(int[] a, int si, int ei) {
        if (si < ei) {
            int pivot = Partition(a, si, ei);
            Quicksort(a, si, pivot - 1); // Recur for left partition
            Quicksort(a, pivot + 1, ei); // Recur for right partition
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 6, 2, 9, 0, 1, 5};
        int si = 0;

        new QuickSort().Quicksort(a, si, a.length - 1);

        System.out.println(Arrays.toString(a)); // Import required
    }
}
