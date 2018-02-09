import java.util.*;
import java.math.*;

public class Prime{


  public static long mersennePrime(int power){
    long finalM = 0;
    for(int i = 1; i<power;i++){
      long Mnum = (2^i)-1;
      if(checkPrime(Mnum)){
        finalM = Mnum;
      }
    }
    return finalM;
  }

  public static void printPrimeFactors(int num) {
    if (num == 2) {
      System.out.println(num);
    }
    for (int i = 2; i <= num; i++) {
      if (num%i == 0) {
        System.out.println(i);
        printPrimeFactors(num/i);
        //num = num/i;
        break;
      }
    }
  }

  public static boolean checkPrime(long check) {
    boolean isPrime = true;
    for (int i = 2; i < check; i++) {
      // '%' is the mod operator. It tells you what the remainder
      // is if you were to divide the two numbers.
      if (check%i == 0) {
        isPrime = false;
        break;
      }
    }
    return isPrime;
  }


  public static int nextPrime(int x) {
    int next = x + 1;
    while (true) {
      if (checkPrime(next)) {
        break;
      }
      else {
        next = next + 1;
      }
    }
    return next;
  }

//create main
  public static void main(String[] args) {

    //create prompt
    System.out.println("Welcome to Prime. Please give me a number.");
    //create Scanner
    Scanner userIn = new Scanner(System.in);
    //take integer input from user and create a variable with it.
    int baseNum = userIn.nextInt();
    //pass baseNum to the nextPrime methods
    long result = mersennePrime(baseNum);
    System.out.println(result);



  }
}
