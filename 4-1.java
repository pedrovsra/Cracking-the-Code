public static boolean isBalanced(Node root) {
	if(checkHeight(root) == -1) return false;
	return true;
}

private static int checkHeight(Node root) {
	if(root == null) return 0;

	int left = checkHeight(root.left);
	if(left == -1) return -1;

	int right = checkHeight(root.right);
	if(right == -1) return -1;

	int diff = Math.abs(left - right);
	if(diff > 1) return -1;
	else return Math.max(left, right) + 1;
}