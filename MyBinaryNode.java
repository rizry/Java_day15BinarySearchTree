package com.java.day15.binarysearchtree;

public class MyBinaryNode<K extends Comparable<K>> implements INode<K> {

  K key;
  private MyBinaryNode<K> left;
  private MyBinaryNode<K> right;

  public MyBinaryNode(K key) {
    this.key = key;
  }

  @Override
  public K getKey() {
    return key;
  }

  @Override
  public void setKey(K key) {
    this.key = key;
  }

  public MyBinaryNode<K> getLeft() {
    return left;
  }

  public void setLeft(MyBinaryNode<K> left) {
    this.left = left;
  }

  public MyBinaryNode<K> getRight() {
    return right;
  }

  public void setRight(MyBinaryNode<K> right) {
    this.right = right;
  }

}