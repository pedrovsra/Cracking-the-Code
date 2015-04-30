public static ArrayList<ArrayList<Integer>> getSubSets(int at, ArrayList<Integer> set) {
	ArrayList<ArrayList<Integer>> allSubSets;

	if(set.size() == at) {
		allSubSets = new ArrayList<ArrayList<Integer>>();
		allSubSets.add(new ArrayList<Integer>());
	} else {
		allSubSets = getSubSets(at+1, set);
		int item = set.get(at);

		ArrayList<ArrayList<Integer>> moreSubSets = new ArrayList<ArrayList<Integer>>();
		for(ArrayList<Integer> subset : allSubSets) {
			ArrayList<Integer> aux = new ArrayList<Integer>();
			aux.addAll(subset);
			aux.add(item);
			moreSubSets.add(aux);
		}
		allSubSets.addAll(moreSubSets);
	}
	return allSubSets;
}
