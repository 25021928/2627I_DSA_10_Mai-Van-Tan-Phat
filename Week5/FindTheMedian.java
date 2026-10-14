import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class FindTheMedian {
  private static void quickSort(float[] arr, int low, int high) {
    if (arr.length < 1) return;
    if (low > high) return;

    float pivot = arr[low];
    float temp = 0;
    int j = low;
    
    for (int i = low + 1; i <= high; i++) {
      if (arr[i] < pivot) {
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
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] input = sc.nextLine().trim().split(" ");
    float[] num_input = new float[input.length];

    int mid = num_input.length / 2;

    for (int i = 0; i < input.length; i++) {
      num_input[i] = Float.parseFloat(input[i]);
    }

    quickSort(num_input, 0, num_input.length - 1);

    System.out.println(num_input[mid]);
  }
}
