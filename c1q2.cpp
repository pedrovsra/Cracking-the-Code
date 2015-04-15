#include <bits/stdc++.h>
using namespace std;

void reverse(char* str) {
	stringstream ss;
	for(int i = strlen(str)-1; i >= 0; i--) ss.put(str[i]);
	cout << ss.str() << endl;
}

int main() {

	char c1[] = {'p','e','d','r','o'};
	char c2[] = {'p','e','d','r','o','\0'};
	
	reverse(c1);
	reverse(c2);

	return 0;
}