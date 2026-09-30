import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class EqualStack {

  private static List<Integer> switchToInt(String[] s_str) {
    List<Integer> s = new ArrayList<>();
    for (int i = 0; i < s_str.length; i++) {
      s.add(Integer.parseInt(s_str[i]));
    }

    return s;
  }

  private static int sum(List<Integer> s) {
    int sum = 0;
    for (int i = 0; i < s.size(); i++) { sum += s.get(i); }

    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] s1_str = sc.nextLine().trim().split(" ");
    String[] s2_str = sc.nextLine().trim().split(" ");
    String[] s3_str = sc.nextLine().trim().split(" ");

    List<Integer> s1= switchToInt(s1_str);
    List<Integer> s2 = switchToInt(s2_str);
    List<Integer> s3 = switchToInt(s3_str);

    int sum1 = sum(s1);
    int sum2 = sum(s2);
    int sum3 = sum(s3);

    int[] temp = {sum1, sum2, sum3};
    int min = 0;
    int max = 0;

    while ((sum1 != sum2) & (sum2 != sum3)) {
      for (int i = 0; i < 3; i++) {
        if (temp[i] < temp[min]) min = i;
        if (temp[i] > temp[max]) max = i;
      }

      while (temp[max] > temp[min] ) {
        if (max == 0) {
          int ind  = s1.size() - 1;
          temp[max] -= s1.get(ind);
          sum1 = temp[max];
          s1.remove(ind);
        } else if (max == 1) {
          int ind  = s2.size() - 1;
          temp[max] -= s2.get(ind);
          sum2 = temp[max];
          s2.remove(ind);
        } else {
          int ind  = s3.size() - 1;
          temp[max] -= s3.get(ind);
          sum3 = temp[max];
          s3.remove(ind);
        }
      }
    }

    System.out.println(temp[0]);
  }
}
