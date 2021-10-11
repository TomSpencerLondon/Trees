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
}
