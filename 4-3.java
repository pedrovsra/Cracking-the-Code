private static Node minimalBST(int[] arr, int start, int end) {
	if(end < start) return null;

	int mid = (start + end) / 2;
	Node n - nde Node(arr[mid]);
	n.left = minimalBST(arr, start, mid - 1);
	n.right = minimalBST(arr, mid + 1, end);
	return n;
}

public static Node minimalBST(int[] arr) {
	return minimalBST(arr, 0, arr.lenght - 1);
}