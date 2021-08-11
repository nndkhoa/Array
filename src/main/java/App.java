import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    //
    // System.out.print("n = ");
    // int n = sc.nextInt();
    //
    // int[] arr = new int[n];
    // for (int i = 0; i < n; i++) {
    //   System.out.format("a[%d] = ", i);
    //   arr[i] = sc.nextInt();
    // }

    // int[] arr = { 2, 4, 6, 8 };
    int[] arr = generateArray(20, -50, 50);
    printArray(arr);
    System.out.format("Sum = %d\n", sumElements(arr));

    if (isAllEven(arr)) {
      System.out.println("Mảng chẵn.");
    } else System.out.println("Mảng không chẵn.");

    sortArrayAsc(arr);
    printArray(arr);

    // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    // System.out.println(arr[3]);

    // for (int element : arr) {
    //   System.out.format("%d, ", element);
    // }
    // System.out.println();

    // for (int i = arr.length - 1; i >= 0; i--) {
    //   System.out.format("%d, ", arr[i]);
    // }
    // System.out.println();

    // int j = 0;
    // while (j < arr.length) {
    //   System.out.format("%d, ", arr[j]);
    //   j++;
    // }
    // System.out.println();
  }

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.format("%d, ", arr[i]);
    }
    System.out.println();
  }

  public static int sumElements(int[] arr) {
    int ret = 0;
    for (int ele : arr) {
      ret += ele;
    }
    return ret;
  }

  // interchangeSort
  public static void sortArrayAsc(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
        }
      }
    }
  }

  public static int[] generateArray(int n, int min, int max) {
    int[] ret = new int[n];
    for (int i = 0; i < ret.length; i++) {
      ret[i] = (int) Math.floor(Math.random() * (max - min)) + min;
    }

    return ret;
  }

  public static boolean isAllEven(int[] arr) {
    for (int n : arr) {
      if (n % 2 != 0) {
        return false;
      }
    }

    return true;
  }
}
