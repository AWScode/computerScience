import java.io.*;
import java.util.*;

public class Factorial{



  public static void main(String[] args) {
    System.out.println("Input a number:");
    Scanner sc = new Scanner(System.in);
    int j = sc.nextInt();
    long k = 1;

    for (int i = 1;i <= j ;i++ ){
      k = k*i;
    }

    System.out.println("This number's factorial is " + Long.toString(k));

  }
}
