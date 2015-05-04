import java.*;

public class Teste {

	public static void main(String[] args) {
		
	}

	//methods to be tested

}

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
