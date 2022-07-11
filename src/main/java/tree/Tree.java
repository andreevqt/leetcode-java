package tree;

import lombok.Data;

public class Tree {

  public static void main(String[] args) {
    var root = new Node(5);
    root.insert(10);
    root.insert(4);
    root.insert(3);
    root.insert(2);
    root.insert(1);
    root.insert(8);
    root.insert(11);

    root.traverse();
  }

  @Data
  public static class Node {
    private final int value;
    private Node left;
    private Node right;
    private Node parent;

    public void traverse() {
      if (left != null) {
        left.traverse();
      }

      System.out.println(value);

      if (right != null) {
        right.traverse();
      }
    }

    public void insert(int value) {
      if (this.value < value) {
        if (right != null) {
          right.insert(value);
          return;
        }

        var node = new Node(value);
        node.parent = this;
        this.right = node;
      } else if (this.value > value) {
        if (left != null) {
          left.insert(value);
          return;
        }

        var node = new Node(value);
        node.parent = this;
        this.left = node;
      }
    }

    public Node find(int value) {
      if (this.value == value) {
        return this;
      }

      if (this.value > value && this.left != null) {
        return this.left.find(value);
      }

      if (this.value < value && this.right != null) {
        return this.right.find(value);
      }

      return null;
    }
  }
}
