public static String compress(String str) {
	int size = str.length();
	if(size <= countSize(str)) return str;

	int counter = 1;
	char at = str.charAt(0);
	StringBuffer sb = new StringBuffer();

	for(int i = 1; i < size; i++) {
		if(str.charAt(i) == at) {
			counter++;
		} else {
			sb.append(at);
			sb.append(couter);
			counter = 1;
			at = str.charAt(i);
		}
	}

	sb.append(at);
	sb.append(counter);
	return sb.toString();
}

private static int countSize(String str) {
	int s = str.length();
	char at = str.charAt(0);
	int counter = 1;
	int size = 0;

	for(int i = 1; i < s; i++) {
		if(str.charAt(i) == at) {
			counter++;
		} else {
			size += 1 + String.valueOf(counter).length();
			at = str.charAt(i);
			counter = 1;
		}
	}

	size += 1 + String.valueOf(counter).length();
	return size;
}