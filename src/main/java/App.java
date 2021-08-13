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

    // if (isAllEven(arr)) {
    //   System.out.println("Mảng chẵn.");
    // } else System.out.println("Mảng không chẵn.");

    System.out.format("MAX = %d\n", findMax(arr));
    System.out.format("MIN = %d\n", findMin(arr));

    int maxIdx = findMaxIndex(arr);
    System.out.format("MAX = %d, Index = %d\n", arr[maxIdx], maxIdx);

    int firstNegIdx = findFirstNegativeIndex(arr);
    if (firstNegIdx >= 0) {
      System.out.format("FirstNegative = %d, Index = %d\n", arr[firstNegIdx], firstNegIdx);
    } else System.out.println("Không có phần tử âm trong dãy!");

    int lastPosIdx = findLastPositiveIndex(arr);
    if (lastPosIdx >= 0) {
      System.out.format("LastPositive = %d, Index = %d\n", arr[lastPosIdx], lastPosIdx);
    } else System.out.println("Không có phần tử dương trong dãy!");

    int minPosIdx = findMinPositiveIndex(arr);
    if (minPosIdx >= 0) {
      System.out.format("MinPositive = %d, Index = %d\n", arr[minPosIdx], minPosIdx);
    } else System.out.println("Không có phần tử dương trong dãy!");

    int maxNegIdx = findMaxNegativeIndex(arr);
    if (maxNegIdx >= 0) {
      System.out.format("MaxNegative = %d, Index = %d\n", arr[maxNegIdx], maxNegIdx);
    } else System.out.println("Không có phần tử âm trong dãy!");

    // sortArrayAsc(arr);
    // printArray(arr);

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

  public static int findMax(int[] arr) {
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    return max;
  }

  public static int findMaxIndex(int[] arr) {
    int idx = 0;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[idx]) {
        idx = i;
      }
    }

    return idx;
  }

  public static int findFirstNegativeIndex(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        return i;
      }
    }

    return -1; // không có phần từ âm
  }

  // public static int findLastPositiveIndex(int[] arr) {
  //   for (int i = arr.length - 1; i >= 0; i--) {
  //     if (arr[i] > 0) {
  //       return i;
  //     }
  //   }
  //
  //   return -1;
  // }

  public static int findLastPositiveIndex(int[] arr) {
    int idx = -1;
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] > 0) {
        idx = i;
        break;
      }
    }

    return idx;
  }

  public static int findMinPositiveIndex(int[] arr) {
    int lastPosIdx = findLastPositiveIndex(arr);
    if (lastPosIdx < 0) {
      return -1;
    }

    int minPosIdx = lastPosIdx;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0 && arr[i] < arr[minPosIdx]) {
        minPosIdx = i;
      }
    }

    return minPosIdx;
  }

  public static int findMaxNegativeIndex(int[] arr) {
    int maxNegIdx = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0 && (maxNegIdx == -1 || arr[i] > arr[maxNegIdx])) {
        maxNegIdx = i;
      }
    }

    return maxNegIdx;
  }

  public static int findMin(int[] arr) {
    int min = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }

    return min;
  }
}
