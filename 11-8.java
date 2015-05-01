public class RankedNode {
	
	public int data;
	public int left_size;
	
	public RankedNode left;
	public RankedNode right;

	public RankedNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
		this.left_size = 0;
	}
	
	public void insert(int number) {
		if(d <= data) {
			if(left != null) left.insert(number);
			else left = new RankedNode(number);
			left_size++;
		} else {
			if(right != null) right.insert(number);
			else right = new RankedNode(number);
		}
	}
	
	public int getRank(int number) {
		if(d == data) return left_size;
		
		if(d < data) {
			if(left == null) return -1;
			else return left.getRank(number);
		} else {
			int right_size = right == null ? -1 : right.getRank(number);
			if(right_size == -1) return -1;
			else return left_size + 1 + right_size;
		}
	}
}

public class RankedTree {
	
	public RankedNode root;
	
	public void track(int number) {
		if(root == null) {
			root = new RankedNode(number);
		} else {
			root.insert(number);
		}
	}
	
	public int getRank(int number) {
		return root.getRank(number);
	}
}
