public static void printInOrder(Node root) {
	if(root == null) return;

	printInOrder(root.left);
	System.out.print(root.data + " ");
	printInOrder(root.right);
}

public static void printPreOrder(Node root) {
	if(root == null) return;

	System.out.print(root.data + " ");
	printPreOrder(root.left);
	printPreOrder(root.right);
}

public static void printPostOrder(Node root) {
	if(root == null) return;

	printPostOrder(root.left);
	printPostOrder(root.right);
	System.out.print(root.data + " ");
}