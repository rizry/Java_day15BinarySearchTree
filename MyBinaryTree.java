package com.java.day15.binarysearchtree;

public class MyBinaryTree<K extends Comparable<K>> {

  private MyBinaryNode<K> root;

  public void add(K key) {
    this.root = this.addRecursively(root, key);
  }

  private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
    if (current == null) return new MyBinaryNode<>(key);
    int compareResult = key.compareTo(current.key);
    if (compareResult == 0) return current;
    if (compareResult < 0) current.setLeft(addRecursively(current.getLeft(), key));
    else current.setRight(addRecursively(current.getRight(), key));
    return current;
  }

  public int getSize() {
    return this.getSizeRecursive(root);
  }

  private int getSizeRecursive(MyBinaryNode<K> current) {
    return current == null ? 0 : 1 + this.getSizeRecursive(current.getLeft()) + this.getSizeRecursive(current.getRight());
  }

  public Integer searchKey(K key) {
    return this.searchKeyRecursively(root, key);
  }

  private int searchKeyRecursively(MyBinaryNode<K> current, K key) {
    if (current == null) return 0;
    else if (current.key == key) return 1;
    else if (key.compareTo(current.key) < 0) return searchKeyRecursively(current.getLeft(), key);
    else if (key.compareTo(current.key) > 0) return searchKeyRecursively(current.getRight(), key);
    return 0;
  }

}