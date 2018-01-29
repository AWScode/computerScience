import  java.util.*;
import java.io.*;

public class Binary{
  public static void main(String[] args)throws IOException{
    //addition only

    //first array input
    //first number is stored in array var
    Scanner sc = new Scanner(System.in);
    System.out.println("Input first Binary number:");
    int[] var = {0,0,0,0,0,0,0,0};
    String num = sc.nextLine();
    for(int i = 0; i < num.length(); i++){
      if(num.charAt(i) == '1'){
        var[i] = 1;
      }
      else if(num.charAt(i) == '0'){
        var[i] = 0;
      }
    }
    System.out.println(Arrays.toString(var));

    //second array input
    //second number is stored in array varr
    System.out.println("Input second Binary number:");
    int[] varr = {0,0,0,0,0,0,0,0};
    Scanner scan = new Scanner(System.in);
    String numm = scan.nextLine();
    for(int j = 0; j < numm.length(); j++){
      if(numm.charAt(j) == '1'){
        varr[j] = 1;
      }
      else if(numm.charAt(j) == '0'){
        varr[j] = 0;
      }
    }
    System.out.println(Arrays.toString(varr));

    //adding the two numbers
    //the result is stored in array sum
    int[] sum = {0,0,0,0,0,0,0,0};
    int carry = 0;
    for(int k = sum.length - 1; k >= 0; k--){
      //calculation
      int h = var[k] + varr[k];
      //storing the result with if loops
      if(h == 0){
        if(carry == 1){
          sum[k] = 1;
          carry = 0;
        }
        else if(carry == 0){
          sum[k] = 0;
          carry = 0;
        }
      }
      else if (h == 1){
        if(carry == 1){
          sum[k] = 0;
          carry = 1;
        }
        else if(carry == 0){
          sum[k] = 1;
          carry = 0;
        }
      }
    }
    //print out the result
    System.out.println(Arrays.toString(sum));

    }
}
