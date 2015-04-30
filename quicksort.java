public static void quicksort(int arr[], int left, int right) {
	int index = partition(arr, left, right);
	if(left < index - 1) {
		quicksort(arr, left, index - 1);
	}

	if(index < right) {
		quicksort(arr, index, right);
	}
}

private static int partition(int[] arr, int left, int right) {
	int pivot= arr[(left+right)/2];

	while(left <= right) {
		while(arr[left] < pivot) left++;
		while(arr[right] > pivot) right++;

		if(left <= right) {
			swap(arr, left, right);
			left++;
			right--;
		}
	}
	return left;
}
