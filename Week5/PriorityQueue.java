import java.util.Scanner;

public class PriorityQueue {
  private static float[] arr = new float[100];
  private static int point = 0;

  private static void quickSort(float[] arr, int low, int high) {
    if (arr.length < 1) return;
    if (low > high) return;

    float pivot = arr[low];
    float temp = 0;
    int j = low;
    
    for (int i = low + 1; i <= high; i++) {
      if (arr[i] > pivot) {
        temp = arr[i];
        j += 1;
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    arr[low] = arr[j];
    arr[j] = pivot;

    quickSort(arr, low, j - 1);
    quickSort(arr, j + 1, high);
  }

  private static void insert(float number) {
    if (point < 99) arr[++point] = number;
  }

  private static int deleteMin() {
    quickSort(arr, 0, point);
    int temp = arr[point];
    arr[point--] = 0;

    return temp;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  }
}
