public static void mergesort(int[] arr) {
	int[] helper = new int[arr.length];
	mergesort(arr, helper, 0, arr.length - 1);
}

public static void mergesort(int[] arr, int[] helper, int low, int high) {
	if(low < high) {
		int mid = (low + high) / 2;
		mergesort(arr, helper, low, mid);
		mergesort(arr, helper, mid + 1, high);

		merge(arr, helper, low, mid, high)
	}
}

private static void merge(int[] arr, int[] helper, int low, int mid, int high) {
	for(int i = low; i <= high; i++) {
		helper[i] = arr[i];
	}

	int hleft = low;
	int hright = mid + 1;
	int curr = low;

	while(hleft <= mid && hright <= high) {
		if(helper[hleft] <= helper[hright]) {
			arr[curr] = helper[hleft];
			hleft++;
		} else {
			arr[curr] = helper[hright];
			hright++;
		}
		cur++;
	}

	int remain = mid - hleft;
	for(int i = 0; i < remain; i++) {
		arr[curr + i] = helper[hleft + i];
	}
}
