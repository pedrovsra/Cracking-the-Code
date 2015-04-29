public static Node partition(Node n, int x) {
	if(n == null) return false;

	Node bStart, bEnd, aStart, aEnd;

	while(n.next != null) {
		if(n.data < x) {
			if(bStart == null) {
				bStart = n;
				bEnd = bStart;
			} else {
				bEnd.next = n;
				bEnd = n;
			}
		} else {
			if(aStart == null) {
				aStart = n;
				aEnd = aStart;
			} else {
				aEnd.next = n;
				aEnd = n;
			}
		}
	}

	if(bStart == null) return aStart;

	bEnd.next = aStart;
	return bStart;
}