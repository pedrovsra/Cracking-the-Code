public static int merge(int n, int m, int i, int j) {
	int ones = ~0;

	int left = ones << (j + 1);
	int right = (1 << i) - 1;

	int mask = left | right;

	int n_clear = n & mask;
	int m_shift = m << i;
	int result = n_clear | m_shift;

	return result;
}