package com.codurance.trees;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

//Function Description
//
//    Complete the getHeight or height function in the editor.
//    It must return the height of a binary tree as an integer.
//
//    getHeight or height has the following parameter(s):
//
//    root: a reference to the root of a binary tree.
public class TreeHeightShould {
  @Test
  void return_zero_for_null() {
    TreeHeight treeHeight = new TreeHeight();
    int result = treeHeight.get(null);

    assertThat(result).isEqualTo(0);
  }

  @Test
  void single_node_returns_zero() {
    TreeHeight treeHeight = new TreeHeight();
    int result = treeHeight.get(new Node());

    assertThat(result).isEqualTo(0);
  }

  @Test
  void root_node_with_child_returns_one() {
    TreeHeight treeHeight = new TreeHeight();


    final Node node = new Node();
    node.insert(new Node());
    int result = treeHeight.get(node);

    assertThat(result).isEqualTo(1);
  }

  @Test
  void root_node_with_two_children_returns_one() {
    TreeHeight treeHeight = new TreeHeight();


    final Node node = new Node();
    node.insert(new Node());
    node.insert(new Node());
    int result = treeHeight.get(node);

    assertThat(result).isEqualTo(1);
  }

  @Test
  void node_has_two_children_with_second_with_child_returns_two() {
    TreeHeight treeHeight = new TreeHeight();


    final Node root = new Node();
    final Node right = new Node();
    right.insert(new Node());
    root.insert(right);
    root.insert(new Node());
    int result = treeHeight.get(root);

    assertThat(result).isEqualTo(2);
  }

  @Test
  void node_has_two_children_with_left_with_child_returns_two() {
    TreeHeight treeHeight = new TreeHeight();
    Node root = new Node();
    Node right = new Node();
    root.insert(right);
    final Node left = new Node();
    left.insert(new Node());
    root.insert(left);
    int result = treeHeight.get(root);

    assertThat(result).isEqualTo(2);
  }
}
