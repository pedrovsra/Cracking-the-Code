public class SetOfStacks {
	ArrayList<Stack<Integer>> arr = new ArrayList<Stack<Integer>>();
	private int capacity;
	private int index = 0;

	public int pop() {
		int v = arr.get(index).pop();
		if(arr.get(index).isEmpty()) {
			arr.remove(i);
			index--;
		}
		return v;
	}

	public void push(int x) {
		arr.get(index).push(x);
		if(arr.get(index).isFull()) {
			this.newStack();
		}
	}

	//discuss with interviewer
	public int popAt(int i) {
		int v = arr.get(i).pop();
		if(arr.get(i).isEmpty()) {
			arr.remove(i);
			index--;
		}
	}

	private void newStack() {
		Stack<Integer> newS = new Stack<Integer>(capacity);
		arr.add(newS);
		index++;
	}
}