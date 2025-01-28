package basics.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequencyCount {
	public static void main(String[] args) {
		int [] arr = {2, 3, 2, 3, 5};
		System.out.println(frequencyCount(arr));
	}
	public static List<Integer> frequencyCount(int[] arr) {

		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int num:arr){
			map.put(num,map.getOrDefault(num,0)+1);
		}


		for (int i = 1; i <= arr.length; i++) {
			list.add(map.getOrDefault(i, 0));
		}

		return list;
	}
}
