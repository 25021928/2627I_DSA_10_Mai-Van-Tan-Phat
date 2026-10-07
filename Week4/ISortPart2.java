import java.util.Scanner;
public class ISortPart2 {

  private static void insertionSort(int[] arr) {
    if (arr.length < 2) return;

    for (int i = 1; i < arr.length; i++) {
      int value = arr[i];
      int t = i - 1;
      while (t >= 0){
        if (arr[t] > value) {
          arr[t + 1] = arr[t];
          t--;
        }
      }
      arr[++t] = value;

      for (int num: arr) System.out.print(num + " ");
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] input = sc.nextLine().trim().split(" ");
    int[] num_input = new int[input.length];
    for (int i = 0; i < input.length; i++) {
      num_input[i] = Integer.parseInt(input[i]);
    }

    insertionSort(num_input);
  }
}
