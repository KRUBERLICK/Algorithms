package sort;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> {
    private T[] aux;

    private void merge(T[] a, int left, int mid, int right) {

        aux = a.clone();

        int i = left;
        int j = mid + 1;

        for (int k = left; k <= right; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > right) {
                a[k] = aux[i++];
            } else if (aux[j].compareTo(aux[i]) < 0) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }

    }

    public void sort(T[] a, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        sort(a, left, mid);
        sort(a, mid + 1, right);

        merge(a, left, mid, right);
    }

    public static void main(String[] args) {
        Integer[] testArr1 = { 1, 8, 3, 9, 4, 7, 5, 9, 2 };
        Double[] testArr2 = { 4.8, 9.2, 1.6, 8.6, 4.8, 7.6, 3.9 };

        new MergeSort<Integer>().sort(testArr1, 0, testArr1.length - 1);
        new MergeSort<Double>().sort(testArr2, 0, testArr2.length - 1);

        System.out.println(Arrays.toString(testArr1));
        System.out.println(Arrays.toString(testArr2));
    }
}
