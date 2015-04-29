public static ArrayList<LinkedList<Node>> levelLinkedList(Node root) {
	ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();

	LinkedList<Node> curr = new LinkedList<Node>();
	if(root != null) curr.add(root);

	while(cur.size > 0) {
		result.add(curr);
		LinkedList<Node> previous = curr;
		curr = new LinkedList<Node>();
		for(int i = 0; i < previous.size(); i++) {
			if(previous.get(i).left != null) curr.add(previous.get(i).left);
			if(previous.get(i).right != null) curr.add(previous.get(i).right);
		}
	}
	return result;
}