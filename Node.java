import java.util.*;
import java.io.*;

public class Node {

  int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

    public int getValue() {
      return this.value;
    }

  /*public Node parent;
  public Node left;
  public Node right;
  public Integer val;


  public Node(int val) {
    this.val = val;
    this.parent = null;
    this.left = null;
    this.right = null;
  }




  public void setParent(Node parent) {
    this.parent = parent;
  }

  public Node getParent() {
    return this.parent;
  }

  public void setChild(Node child) {
    if (child.getValue() >= this.val) {
      this.right = child;
    }
    else {
      this.left = child;
    }
  }

  public boolean getChild(boolean right) {
    if (right) {
      return true;
    }
    return false;
  }*/

}
