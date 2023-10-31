#include <iostream>
using namespace std;

void myFunction() {
    int localVar = 10; // Local variable
    cout << localVar << endl; 
}

int main() {
    myFunction(); // Prints 10
    // cout << localVar << endl; // Error: localVar is not in scope
    return 0;
}
