public static boolean deleteNode(Node n) {
	if(n == null || n.next == null) return false;

	Node aux = n.next;
	n.data = aux.data;
	n.next = aux.next;
	return true;
}