public static int magic(int[] arr, int start, int end) {
	if(end < start || start < 0 || end >= arr.length) return -1;

	int mid = (start + end)/2;

	if(arr[mid] == mid) return mid;
	
	if(arr[mid] < mid) {
		return magic(arr, mid+1, end);
	} else {
		return magic(arr, start, mid-1);
	}
}
