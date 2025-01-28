package basics.math;

public class MinJumps {
	public static void main(String[] args) {
		int [] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		System.out.println(minJumps(arr));
	}
	static int minJumps(int[] arr) {
		if(arr[0]==0)return -1;

		int step=arr[0];
		int maxReach=arr[0];
		int jump=1;
		int n=arr.length;

		for(int i=1;i<n;i++){
			if(i==n-1)return jump;
			maxReach=Math.max(maxReach, i+arr[i]);
			step--;
			if(step==0){
				jump++;
				if(i>=maxReach)return -1;
				step=maxReach-i;
			}
		}
		return -1;
	}
}
