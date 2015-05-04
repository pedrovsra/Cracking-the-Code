private static int search(String[] arr, int first, int last, String str) {
	if(first > last) return -1;

	int mid = (first + last) / 2;
	if(arr[mid].isEmpty()) {
		int left = mid - 1;
		int right = mid + 1;

		while(true) {
			if(left < first || right > last) return -1;
			if(right <= last && !arr[right].isEmpty()) {
				mid = right;
				break;
			} else if(left >= first && !arr[left].isEmpty()) {
				mid = left;
				break;
			}
		}
		right++;
		left--;
	}

	if(str.equals(arr[mid])) return mid;

	if(str.compareTo(arr[mid]) < 0) return search(arr, mid + 1, last, str);
	if(str.compareTo(arr[mid]) > 0) return search(arr, first, mid - 1, str)
}

public static int search(String[] arr, String str) {
	return search(arr, 0, arr.length - 1, str);
}