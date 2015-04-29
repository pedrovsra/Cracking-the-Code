private int size;
//adjacent list
ArrayList<Integer>[] adj = new ArrayList<Integer>[size];

public static boolean hasRoute(int node1, int node2) {
	boolean[] visisted = new boolean[size];
	visited[node1] = true;

	Queue<Integer> q = new Queue<Integer>();
	q.add(node1);
	while(!q.isEmpty()) {
		int v = q.pop();
		ArrayList<Integer> aux = adj[v];
		for(int i = 0; aux.size(); i++) {
			if(!check[aux.get(i)]) {
				if(aux.get(i) == node2) return true;

				check[aux.get(i)];
				q.add(aux.get(i));
			}
		}
	}
	return false;
}