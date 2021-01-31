import java.util.Arrays;
import java.util.Scanner;

class BinarySearchRecursion {
  public static int binarySearch(int arr[], int first, int last, int search) {
    if (last >= first) {
      int mid = first + (last - first) / 2;
      if (arr[mid] == search) {
        return mid;
      }
      if (arr[mid] > search) {
        return binarySearch(arr, first, mid - 1, search);
      } else {
        return binarySearch(arr, mid + 1, last, search);
      }
    }
    return -1;
  }

  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter number of elements");
    int size = scn.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter " + size + " integers");

    for (int i = 0; i < size; i++)
      arr[i] = scn.nextInt();
    Arrays.sort(arr);
    System.out.println("enter the value to search");
    int search = scn.nextInt();
    int last = size - 1;
    int result = binarySearch(arr, 0, last, search);
    if (result == -1)
      System.out.println("Element is not found ");
    else
      System.out.println("Element is found at index: " + result);
  }
}
