import java.util.Scanner;
import java.util.Stack;
public class BalancedBracket {
  public static int toInt(char s) {
    switch (s) {
      case '(':
        return 1;
      case '[':
        return 2;
      case '{':
        return 3;
      case ')':
        return -1;
      case ']':
        return -2;
      case '}':
        return -3;
      default:
        return 0;
    }
  }
  public static void check(char s, Stack<Integer> bracket) throws Exception{
    if (toInt(s) > 0) bracket.add(toInt(s));
    else if (toInt(s) < 0) {
      if (!bracket.isEmpty()) {
        if (bracket.pop() + toInt(s) != 0) throw new Exception();
      } else {
        throw new Exception();
      }
    }
  }
  public static void main(String[] args) {
    Stack<Integer> bracket = new Stack<>();

    Scanner sc = new Scanner(System.in);
    String in = sc.nextLine();

    for (int i = 0; i < in.length(); i++) {
      try {
        check(in.charAt(i), bracket);
      } catch (Exception e) {
        System.out.println("Kiểm tra không khớp");
      }
    }

    System.out.println("Kiểm tra khớp toàn bộ");
  } 
}
