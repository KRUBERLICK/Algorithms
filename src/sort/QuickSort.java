package sort;

import java.util.Arrays;

public class QuickSort {

    public <T extends Comparable<T>> void sort(T[] a, int left, int right) {

        int i = left;
        int j = right;
        T x = a[(left + right) / 2];

        do {
            while (a[i].compareTo(x) < 0 && i < right) {
                i++;
            }
            while (x.compareTo(a[j]) < 0 && left < j) {
                j--;
            }
            if (i <= j) {
                T buf = a[i];
                a[i] = a[j];
                a[j] = buf;
                i++;
                j--;
            }
        } while (i <= j);

        if (left < j) {
            sort(a, left, j);
        }
        if (i < right) {
            sort(a, i, right);
        }
    }

    public static void main(String[] args) {
        Integer[] testArr1 = { 1, 8, 3, 9, 4, 7, 2, 8 };
        Double[] testArr2 = { 4.8, 2.9, 9.3, 5.5, 7.8, 2.4 };

        new QuickSort().sort(testArr1, 0, testArr1.length - 1);
        new QuickSort().sort(testArr2, 0, testArr2.length - 1);

        System.out.println(Arrays.toString(testArr1));
        System.out.println(Arrays.toString(testArr2));
    }
}
