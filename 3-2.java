public class StackM extends Stack<Integer> {
	private Stack<Integer> minS;

	public StackM() {
		this.minS = new Stack<Integer>();
	}

	public void push(int x) {
		if(x < this.min()) {
			minS.push(x);
		}

		super.push(x);
	}

	public int pop() {
		int x = super.pop();
		if(x == this.min())
			minS.pop();
		return x;
	}

	public int min() {
		if(minS.isEmpty()) {
			return Integer.MAX_VALUE;
		}
		return minS.peek();
	}
}