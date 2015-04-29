public static boolean isUnique(String str) {
	int codificationSize;
	if(str.length() > codificationSize) return false;

	boolean[] aux = new boolean[codificationSize];
	for(int i = 0; i < str.length(); i++) {
		if(aux[str.charAt(i)]) return false;
		else aux[str.charAt(i)] = true;
	}
	return true;
}

public static boolean isUnique2(String str) {
	int check = 0;
	for(int i = 0; i < str.length(); i++) {
		int value = str.charAt(i) - 'a';
		if((check & (1 << value)) > 0) return false;

		check |= (1 << value);
	}
	return true;
}