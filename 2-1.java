public static void removeDuplicates(Node n) {
	HashTable hash = new HashTable();
	Node aux = null;

	while(n != null) {
		if(hash.containsKey(n.data)) {
			aux.next = n.next;
		} else {
			hash.add(n.data, true);
			aux = n;
		}
		n = n.next();
	}
}