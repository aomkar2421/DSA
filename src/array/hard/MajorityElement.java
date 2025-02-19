package array.hard;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
	public static void main(String[] args) {
		int [] arr = {3,2,3};
		printArray(arr);
		System.out.println(majorityElement(arr));
	}
	
    public static List<Integer> majorityElement(int[] arr) {
        int cnt1 = 0;
        int cnt2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int n = arr.length;
        
        for(int i=0; i<arr.length; i++){
            if(cnt1 == 0 && arr[i] != ele2){
                ele1 = arr[i]; 
                cnt1++;
            }
            else if(cnt2 == 0 && arr[i] != ele1){
                ele2 = arr[i];
                cnt2++;
            }
            else if(ele1 == arr[i] && arr[i] != ele2 ){
                cnt1++;
            }
            else if(ele2 == arr[i] && arr[i] != ele1){
                cnt2++;
            }else {
				cnt1--;
				cnt2--;
			}
        }

        ArrayList<Integer> al = new ArrayList<>();

        cnt1 = 0;
        cnt2 = 0;
        int mini = (int) (n/3);

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == ele1) cnt1++;
            if(arr[i] == ele2) cnt2++;
        }

        if(cnt1 > n/3) al.add(ele1);
        if(cnt2 > n/3) al.add(ele2);

        return al;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
