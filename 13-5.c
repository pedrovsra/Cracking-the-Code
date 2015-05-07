//volatile integer
int volatile x;
volatile int x;

//pointer to volatile integer
volatile int * x;
int volatile * x;

//volatile pointer to non-volatile variable
int * volatile x;

//volatile variable pointer to volatile memory
int volatile * volatile x;

//example 1 - not optimization
int opt = 1;
void Fn(void) {
	start:
		if(opt == 1) goto start;
		else break;
}
//the compiler would optimize to:
void Fn(void) {
	start:
		if(true) goto start; //becomes an infinite loop
}

//this does not:
volatile int opt = 1;
void Fn(void) {
	start:
		if(opt == 1) goto start;
		else break;
}