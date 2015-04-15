package cap1;

import java.util.Arrays;
import java.util.HashSet;

public class C1 {

	public static void main(String[] args) {
		String a = "camile";
		String b = "camila";
		String c = "pedro";
		String d = "ordep";

		System.out.println(isPermutation(a, b));
		System.out.println(isPermutation(c, d));
	}

	// 1.1
	public static boolean hasUnique(String s) {
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		return set.size() == s.length();
	}

	// 1.1 part 2
	public static boolean hasUniqueBad(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j))
					return false;
			}
		}
		return true;
	}

	// 1.3
	public static boolean isPermutation(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;

		char sc1[] = s1.toCharArray();
		char sc2[] = s2.toCharArray();

		Arrays.sort(sc1);
		Arrays.sort(sc2);

		for (int i = 0; i < s1.length(); i++) {
			if (sc1[i] != sc2[i])
				return false;
		}
		return true;
	}
}