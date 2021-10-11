package com.codurance.trees;

public class Node {
  private Node right;
  private Node left;

  public void insert(Node node) {
    if (right == null){
      right = node;
    }else if (left == null){
      left = node;
    }
  }

  public Node right() {
    return right;
  }
}
