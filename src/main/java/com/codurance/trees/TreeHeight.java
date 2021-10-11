package com.codurance.trees;

public class TreeHeight {
  public int get(Node node) {
    if (node == null || node.right() == null){
      return 0;
    }

    return 1;
  }
}
