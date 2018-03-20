import java.util.*;
import java.io.*;
import java.lang.*;


public class CompareGene{
  public static void main(String[] args) {
    System.out.println("Input the frst sequence: ");
    Scanner sc = new Scanner(System.in);
    String sequence1 = sc.nextLine();
    System.out.println("Input the second sequence: ");
    Scanner cs = new Scanner(System.in);
    String sequence2 = cs.nextLine();
    int dif = 0;
    if(sequence1.length() < sequence2.length()){
      for(int i = 0; i < sequence1.length(); i++){
        if(sequence1.charAt(i) != sequence2.charAt(i)){
          dif = dif + 1;
        }
      }
      dif = dif + sequence2.length() - sequence1.length();
    }

    if(sequence2.length() < sequence1.length()){
      for(int j = 0; j < sequence2.length(); j++){
        if(sequence1.charAt(j) != sequence2.charAt(j)){
          dif = dif + 1;
        }
      }
      dif = dif + sequence1.length() - sequence2.length();
    }

    if(sequence1.length() == sequence2.length()){
      for(int i = 0; i < sequence1.length(); i++){
        if(sequence1.charAt(i) != sequence2.charAt(i)){
          dif = dif + 1;
        }
      }
    }
    System.out.println("The amount of difference is: " + dif);


  }
}
