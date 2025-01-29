package basics.recursion;

public class SumOfN {
	public static void main(String[] args) {
		int n = 5;
		sumOfSeries(n);
	}
	
    static int sumOfSeries(int n) {
        if(n<1){
            return 0;
        }
        int sum = n*n*n;
        return sum + sumOfSeries(n-1);
    }
    
}
