package basics.recursion;

public class Print_NTo1 {
	public static void main(String[] args) {
		int n = 10;
		printNos(n);
	}
    static void printNos(int n) {
        if(n<=0){
            return;
        }
        System.out.print(n+" ");
        printNos(n-1);
    }
}
