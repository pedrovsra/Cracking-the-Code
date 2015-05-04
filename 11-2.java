class AnagramComparator implements Comparator<String> {
	public String sortChars(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}

	public int compare(String s1, String s2) {
		return sortChars(s1).compareTo(sortChars(s2));
	}
}

private static String sortChar(String s) {
	char[] cs = s.toCharArray();
	Arrays.sort(cs);
	return new String(cs);
}

private static int compareStrings(String s1, String s2) {
	String ss1, ss2;
	ss1 = sortChar(s1);
	ss1 = sortChar(s2);
	return ss1.compareTo(s2);
}

public static void sort(String[] arr) {
	HashTable<String, LinkedList<String>> hash = new HashTable<String, LinkedList<String>>();

	for(String s : arr) {
		String key = sortChar(s);
		if(!hash.containsKey(key)) hash.put(key, new LinkedList<String>());
		LinkedList<String> anagrams = hash.get(key);
		anagrams.push(s);
	}

	int index = 0;
	for(String key : hash.keySet()) {
		LinkedList<String> list = hash.get(key);
		for(String t : list) {
			arr[index] = t;
			index++;
		}
	}
}