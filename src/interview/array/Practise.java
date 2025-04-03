package interview.array;

import java.util.ArrayList;

public class Practise {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(3);
		
		ArrayList<ArrayList<Integer>> fal = new ArrayList<ArrayList<Integer>>();
		fal.add(new ArrayList<Integer>(al));
		al.clear();
		al.add(5);
		al.add(6);		
		fal.add(new ArrayList<Integer>(al));
		System.out.println(al);
		System.out.println(fal);
	}
}
