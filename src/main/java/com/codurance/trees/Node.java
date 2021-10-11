package com.codurance.trees;

public class Node {
  private Node right;

  public void insert(Node node) {
    this.right = node;
  }

  public Node right() {
    return right;
  }
}
