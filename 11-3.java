public static int search(int[] arr, int left, int right, int x) {
	int mid = (left + right) / 2;

	if(x == arr[mid]) return mid;

	if(right < left) return -1;

	if(arr[left] < arr[mid]) {
		if(x >= arr[left] && x <= arr[mid]) return search(arr, left, mid - 1, x);
		else return search(arr, mid + 1, right, x);
	} else if(arr[mid] < arr[left]) {
		if(x >= arr[mid] && x <= a[right]) return search(arr, mid + 1, right, x);
		else search(arr, left, mid - 1, x);
	} else if(arr[left] == arr[mid]) {
		if(arr[mid] != arr[right]) {
			return search(arr, mid + 1, right, x);
		} else {
			int result = search(arr, left, mid - 1, x);
			if(result == -1) return search(a, mid + 1, right, x);
			else return result;
		}
	}
	return -1;
}