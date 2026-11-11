import java.util.List;
import java.util.ArrayList;

private class Node {
  int value;
  Node left;
  Node right;
}

class BST {
  Node rootNode;

  private void addNode(Node node) {
    /*
    Viết lệnh thêm node vào cây
    
    */
  }
}
public class LCA {
  private static List<Integer> a = new ArrayList<>();
  private static List<Integer> b = new ArrayList<>();
  private static int findNearestParent(BST tree, int val1, int val2) {
    findNode(tree.rootNode, val1, a);
    findNode(tree.rootNode, val2, b);

    int i = 0;
    while (true) {
      if (a.get(i) != b.get(i)) return a.get(--i);
      i++;
    }
  }

  private static void findNode(Node currNode, int value, List<Integer> list) {
    if (currNode.value > value) {
      list.add(currNode.value);
      findNode(currNode.left, value, list);
    } else if (currNode.value < value) {
      list.add(currNode.value);
      findNode(currNode.right, value, list);
    } else {
      return;
    }
  }
  public static void main(String[] args) {
    /*
    
    Khởi tạo 1 cây BST BSTree
    Lấy 2 giá trị val1 và val2
    -----------------------
    System.out.println(findNearestParent(BSTree, val1, val2));
    
    */
  }
}
