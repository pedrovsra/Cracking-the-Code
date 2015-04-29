public static boolean isRotation(String s1, String s2) {
	if((s1.length() != s2.length()) && s1.length() <= 0) {
		return false;
	}

	String ss1 = s1 + s1;
	return isSubstring(ss1, s2);
}