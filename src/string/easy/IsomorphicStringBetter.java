package string.easy;

import java.util.HashMap;

public class IsomorphicStringBetter {
	public static void main(String[] args) {
		String s = "foo";
		String t = "bar";
		System.out.println(s+" "+t);
		System.out.println(isIsomorphic(s, t));
	}
	
    public static boolean isIsomorphic(String s, String t) {
    	
    	if (s.length() != t.length()) {
			return false;
		}
    	
    	HashMap<Character, Character> hMap = new HashMap<Character, Character>();
    	
    	for (int i = 0; i < s.length(); i++) {
    		char c1 = s.charAt(i);
    		char c2 = t.charAt(i);
    		System.out.println("c1 : "+c1);
    		System.out.println("c2 : "+c2);
    		System.out.println(hMap);
    		
    		if (hMap.containsKey(c1) && hMap.get(c1) != c2 || !hMap.containsKey(c1) && hMap.containsValue(c2)) {
				return false;
			}
    		
    		hMap.put(c1, c2);
		}
    	    	
    	return true;
    }
	
}
