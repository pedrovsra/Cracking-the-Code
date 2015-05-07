void printLast10Lines(char* fileName) {
	const int k = 10;
	ifstream file (fileName);
	string L[k];
	int size = 0;

	while(file.good()) {
		getLine(file, L[size % k]);
		size++;
	}

	int start = size > k ? (size % k) : 0;
	int count = min(k, size);

	for(int i = 0; i < count; i++) {
		cout << L[(start + i) % k] << endl;
	}
}