package com.codurance.trees;

public class TreeHeight {
  public int get(Node node) {
    if (node == null || node.right() == null) {
      return 0;
    }else if (node.right().right() != null || (node.left() != null && node.left().right() != null)){
      return 2;
    }

    return 1;
  }
}
