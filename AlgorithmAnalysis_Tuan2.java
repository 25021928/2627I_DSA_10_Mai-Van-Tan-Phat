import java.util.Scanner;
public class AlgorithmAnalysis_Tuan2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] input = sc.nextLine().trim().split(" ");

    double[] data = new double[input.length];
    for (int i = 0; i < input.length; i++) {
      data[i] = Double.parseDouble(input[i]);
    }

    double max_val = data[0];
    double min_val = data[0];

    for (int i = 0; i < data.length; i++) {
      if (data[i] > max_val) max_val = data[i];
      else if (data[i] < min_val) min_val = data[i];
    }

    System.out.print("Cặp số cần tìm là: " + min_val + " " + max_val);
  }
}