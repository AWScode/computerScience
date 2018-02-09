import java.util.*;
import java.math.*;

public class Prime{


  public static double mersennePrime(int power){
    double finalM = 0;
    for(int i = 1; i<power;i++){
      double mNum = Math.pow(2,1)-1;
      if(checkPrime(mNum)){
        finalM = mNum;
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

  public static boolean checkPrime(double check) {
    boolean isPrime = true;
    for (int i = 2; i < check; i++) {
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

  public static void main(String[] args) {

    System.out.println("Welcome to Prime. Please give me a number.");

    Scanner userIn = new Scanner(System.in);

    int baseNum = userIn.nextInt();

    double result = mersennePrime(baseNum);
    System.out.println(result);



  }
}
