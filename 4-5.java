public static boolean isBST(Node root) {
	return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
}

private static boolean isBST(Node root, int min, int max) {
	if(n == null) return true;

	if(n.data <= min || n.data > max) return false;

	if(!isBST(n.left, min, n.data)) return false;
	if(!isBST(n.right, n.data, max)) return false;

	return true;
}