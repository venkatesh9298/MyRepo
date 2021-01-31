import java.util.Scanner;

public class LinearSearch {
  public static void main(String[] args) {
    int size, i, num, flag = 0;
    Scanner scn = new Scanner(System.in);
    System.out.println("enter the size of elements ");
    size = scn.nextInt();
    int arr[] = new int[size];
    for (i = 0; i < size; i++)
      arr[i] = scn.nextInt();
    flag = 0;
    System.out.println("enter the number do u want to search ");
    num = scn.nextInt();

    for (i = 0; i < size; i++) {
      if (arr[i] == num) {
        System.out.println("element  found at " + i + " index  position");
        flag++;
      }
    }

    if (flag == 0)
      System.out.println("not found");
    else if (flag == 1)
      System.out.println("element found  " + flag + "time im the list");
    else
      System.out.println("element is duplicated " + flag + "times");

  }
}
