

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortRecursion {
  public static void main(String a[]) {

    Scanner scn = new Scanner(System.in);
    System.out.println("Enter  how many numbers to be sorted ");
    int n = scn.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter " + n + " numbers ");
    for (int i = 0; i < n; i++) {
      int number = scn.nextInt();
      arr[i] = number;
    }
    System.out.println("List before  Mergesort");
    System.out.println(Arrays.toString(arr));
    mergeSort(arr, 0, n - 1);
    System.out.println("List after Mergesort");
    System.out.println(Arrays.toString(arr));
    scn.close();
  }

  public static void mergeSort(int arr[], int low, int high) {
    if (low >= high) {
      return;
    }
    int middle = (low + high) / 2;
    mergeSort(arr, low, middle);
    mergeSort(arr, middle + 1, high);
    merge(arr, low, middle, high);
  }

  private static void merge(int arr[], int low, int middle, int high) {
    int firstEnd = middle;
    int secondStart = middle + 1;
    int l = low;
    while ((l <= firstEnd) && (secondStart <= high)) {
      if (arr[low] < arr[secondStart]) {
        low++;
      } else {
        int temp = arr[secondStart];

        for (int j = secondStart - 1; j >= low; j--) {
          arr[j + 1] = arr[j];
        }

        arr[low] = temp;
        low++;
        firstEnd++;
        secondStart++;

      }
    }
  }
}
