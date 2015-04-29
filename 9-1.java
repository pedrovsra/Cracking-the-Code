public static int countSteps(int n) {
	if(n < 0) return 0;
	if(n == 0) return 1;

	return countSteps(n - 1) + countSteps(n - 2) + countSteps(n - 3);
}

public static int countStepsDP(int n, int[] memo) {
	if(n < 0) return 0;
	if(n == 0) return 1;
	if(memo[n] > -1) return memo[n];

	return memo[n] = countSteps(n - 1, memo) + countSteps(n - 2, memo) + countSteps(n - 3, memo);
}
