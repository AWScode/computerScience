import java.util.*;
import java.math.*;

public class Prime {
  public static boolean isPrime(long number) {
    for (long a = 2; a < number; a++) {
        if (number % a == 0) {
            return false;
        }
        else{
          break;
        }
      }
    return true;}

  public static long nextPrime(long x){
    long j = x + 1;
    while(true){
      if(isPrime(x)){
        break;
      }
      else{
        j = j + 1;
      }
    }
    return j;

  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long i = sc.nextLong();
    System.out.println("Enter a number: ");
    sc.close();
  }

}
