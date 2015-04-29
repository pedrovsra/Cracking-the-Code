public static Node successor(Node n) {
	if(n == null) return null;

	if(n.right != null) {
		n = n.right;
		while(n.left != null) {
			n = n.left;
		}
		return n;
	} else {
		Node q = n;
		Node x = q.parent;
		while(x != null && x.left != q) {
			q = x;
			x = x.parent;
		}
		return x;
	}
}