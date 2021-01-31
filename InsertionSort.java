
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    int size, i, j, temp;
    System.out.print("Enter Array Size : ");
    size = scn.nextInt();
    int arr[] = new int[size];
    System.out.print("Enter Array Elements : ");

    for (i = 0; i < size; i++) {
      arr[i] = scn.nextInt();
    }

    System.out.println("Array elements before Isertion sort :");
    System.out.println(Arrays.toString(arr));

    for (i = 1; i < size; i++) {

      for (j = i - 1; j >= 0 && arr[j + 1] < arr[j]; j--) {
        temp = arr[j + 1];
        arr[j + 1] = arr[j];
        arr[j] = temp;
      }
    }

    System.out.println("Array elements after  Isertion sort :");
    System.out.println(Arrays.toString(arr));
  }
}


