package basics.recursion;

public class PrintName {
	public static void main(String[] args) {
		int n = 5;
		printGfg(n);
	}

	static void printGfg(int n) {
		if(n==0){
			return;
		}
		System.out.print("GFG ");
		printGfg(n-1);
	}

}
