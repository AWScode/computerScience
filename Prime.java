import java.util.*;
import java.math.*;

public class Prime {
  public static boolean isPrime(int number) {
    for (int a = 2; a <= number/2; a++) {
        if (number % a == 0) {
            return false;
        }
        else{
          return true;
        }
      }
    return true;
    }

  public static int nextPrime(int x){
    int j = x + 1;
    while(true){
      if(isPrime(x)){
        break;
      }
      else{
        j = j + 1;
      }
    }
    System.out.println(Integer.toString(j));
    return j;

  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    System.out.println("Enter a number: ");
    sc.close();
    nextPrime(i);
  }

}
