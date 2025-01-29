package basics.recursion;

import java.util.ArrayList;

public class Factorial {
	public static void main(String[] args) {
		int n = 3;
		factorialNumbers(n);
	}
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> list = new ArrayList<>();
        long factorial = 1;
        long i = 1;
        
        while(factorial <= n){
            list.add(factorial);
            i++;
            
            factorial *= i;
        }
        return list;
    }
}
