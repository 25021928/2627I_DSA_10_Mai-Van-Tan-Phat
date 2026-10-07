import java.util.Scanner;
public class CountingSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] input = sc.nextLine().trim().split(" ");

    int[] num_input = new int[input.length];
    int max_arg = 0;
    for (int i = 0; i < input.length; i++) {
      num_input[i] = Integer.parseInt(input[i]);
      if (num_input[i] > max_arg) max_arg = num_input[i];
    }

    int[] counter = new int[max_arg + 1];

    for (int i = 0; i < num_input.length; i ++) {
      counter[num_input[i]]++;
    }

    System.out.println(num_input[0]);

    for (int i : counter) {
      System.out.print(i + " ");
    }
  }
}
