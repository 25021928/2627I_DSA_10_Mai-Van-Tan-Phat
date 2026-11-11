import java.util.List;
import java.util.ArrayList;

private class Node {
  int value;
  Node left;
  Node right;
}

class Tree {
  Node rootNode;

  private void addNode(Node node) {
    /*
    Viết lệnh thêm node vào cây
    
    */
  }
}
public class Bai5 {
  private static List<Integer> list;

  private static boolean isBST(Tree tree) {
    list = new ArrayList<>();
    inOrder(tree.rootNode);

    if (list.size() == 1) return true;

    for (int i = 1; i < list.size(); i++) {
      if (list.get(i) < list.get(i - 1)) return false;
    }

    return true;
  }

  private static void inOrder(Node node) {
    if (node.value == null) return;

    inOrder(node.left);
    list.add(node.value);
    inOrder(node.right);
  }
  public static void main(String[] args) {
    /*
    Nhận vào 1 Tree tree
    -------------------
    if (isBST(tree)) System.out.println("Là cây tìm kiếm nhị phân");
    
    */
  }
  
}
