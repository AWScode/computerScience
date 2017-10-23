

import java.util.*;


public class palindromeChecker {

    public static boolean palindromeCheck(String test) {
       test = test.replaceAll("\\s+", "");
       test = test.toLowerCase();
    	 int i = 0;
    	    int j = test.length() - 1;
    	    while (j > i) {
    	        if (test.charAt(i) != test.charAt(j)) {
    	            return false;
    	        }
    	        ++i;
    	        --j;
    	    }
    	    return true;
}

    public static void main(String[] args){

        System.out.println("Welcome to Palindrome Tester \n Please type a word or phrase or number you would like to check!");
        Scanner scan = new Scanner(System.in);

        if (palindromeCheck(scan.nextLine())) {
            System.out.println("That's a Palindrome!");
        }
        else {
            System.out.println("That's not a Palindrome!");
        }
        scan.close();

    }

}
