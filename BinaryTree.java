import java.util.*;
import java.io.*;


public class BinaryTree {

  public Node root;


  //loop itself
  //recursion
  private Node addNode(Node current, int value) {
      if (current == null) {
          return new Node(value);
      }

      if (value < current.value) {
          current.left = addNode(current.left, value);
      } else if (value > current.value) {
          current.right = addNode(current.right, value);
      } else {
          return current;
      }

      return current;
  }
//add
public void add(int value) {
  root = addNode(root, value);
}


//locate the node
public boolean findNode(Node current, int value){
  if (current == null) {
        return false;
    }
  else if (value == current.value) {
        System.out.println("It's there.");
        return true;
    }
  else if (value < current.value){
        findNode(current.left, value);
  }
  else if (value < current.value){
        findNode(current.right, value);
  }

  return false;
}

public boolean containsNode(int value) {
    return findNode(root, value);
}

//similar to add node but more complicated bc the child
//three
public Node deleteNode(Node current, int value) {
    if (current == null) {
        return null;
    }
    if (value < current.value) {
        current.left = deleteNode(current.left, value);
        return current;
    }
    if (value > current.value) {
        current.right = deleteNode(current.left, value);
        return current;
    }

    if (value == current.value) {
      //node with no child
      if (current.left == null && current.right == null) {
        return null;
      }
      //node with one child
      if (current.right == null) {
        current = current.left;
        return current;
      }

      if (current.left == null) {
        current = current.right;
        return current;
      }
      //node with two child
      //the smaller child take the deleted node's place
      else {
        if(current.left.getValue() < current.right.getValue()){
          current = current.left;
          return current;
        }
        if(current.left.getValue() > current.right.getValue()){
          current = current.right;
          return current;
        }
      }
    }

    return null;
}





  public static void main(String[] args) {

    BinaryTree bt = new BinaryTree();

    bt.add(13);
    bt.add(8);
    bt.add(12);
    bt.add(14);
    bt.add(15);
    bt.add(11);/

    System.out.println("Which node you want to check?");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    bt.containsNode(num);


  }
}


//reference: Crusoveanu, Loredana. “Implementing a Binary Tree in Java.” Baeldung, 19 Apr. 2018, www.baeldung.com/java-binary-tree.
