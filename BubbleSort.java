
import java.util.Arrays;
import java.util.Scanner;

class BubbleSort {
  public static void main(String[] args) {
    int size, i, j, temp;
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the number of integers to sort:");
    size = scn.nextInt();
    int array[] = new int[size];
    System.out.println("Enter " + size + " integers: ");

    for (i = 0; i < size; i++)
      array[i] = scn.nextInt();
    System.out.println("Before BubbleSort the elements are :" + Arrays.toString(array));

    for (i = 0; i < (size - 1); i++) {
      for (j = 0; j < size - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
    System.out.println("After BubbleSort the elements are :" + Arrays.toString(array));

  }
}
