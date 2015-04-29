boolean containsTree(Node t1, Node t2) {
	if(t2 == null) return true;
	return subtree(t1, t2);
}

boolean subtree(Node t1, Node t2) {
	if(t1 == null) return false;

	if(t1.data == t2.data) {
		if(matchTree(t1, t2)) return true;
	}
	return (subtree(t1.left, t2) || subtree(t1.right, t2));
}

boolean matchTree(Note t1, Node t2) {
	if(t1 == null && t2 == null) return true;
	if(t1 == null || t2 == null) return false;
	if(r1.data != r2.data) return false;

	return (matchTree(t1.left, t2) && matchTree(t1.right, t2));
}