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

public static ArrayList<ArrayList<Integer>> getSubSets(ArrayList<Integer> set) {
	ArrayList<ArrayList<Integer>> allSubSets = new ArrayList<ArrayList<Integer>>();

	int max = 1 << set.size();
	for(int k = 0; k < max; k++) {
		ArrayList<Integer> subset = convertIntToSet(k, set);
		allSubSets.add(subset);
	}
	return allSubSets;
}

private static ArrayList<Integer> convertIntToSet(int x, ArrayList<Integer> set) {
	ArrayList<Integer> subset = new ArrayList<Integer>();
	int index = 0;

	for(int i = x; i > 0; x >>= 1) {
		if((x & 1) == 1) subset.add(set.get(index));
		index++;
	}
	return subset;
}
