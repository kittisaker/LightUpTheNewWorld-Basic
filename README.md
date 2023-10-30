# LightUpTheNewWorld-Basic : Chapter-2 Variables

## Instance Variables (Non-Static Fields)
```cpp
#include <iostream>
using namespace std;

class MyClass{
private:
    int myVar;

public:
    void printMyVar(){
        cout << myVar << endl;
    }

    void setMyVar(int value){
        myVar = value;
    }

};

int main() {
    MyClass obj;
    obj.printMyVar(); // Unspecified behavior: may print a garbage value
    obj.setMyVar(10);
    obj.printMyVar(); // Prints 10
    return 0;
}
```

```Java
public class MyClass {
    private int myVar; // Automatically initialized to 0 for int type

    public void printMyVar() {
        System.out.println(myVar);
    }

    public void setMyVar(int myVar) {
        this.myVar = myVar;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.printMyVar(); // Prints 0
        obj.setMyVar(10);
        obj.printMyVar(); // Prints 10
    }
}
```

```typescript
class MyClass {
    private myVar: number;  // Automatically initialized to undefined

    printMyVar(): void {
        console.log(this.myVar);
    }

    setMyVar(value: number): void {
        this.myVar = value;
    }
}

const obj = new MyClass();
obj.printMyVar(); // Prints undefined
obj.setMyVar(10);
obj.printMyVar(); // Prints 10
```

```python
class MyClass:
    def printMyVar(self):
        try:
            print(self.myVar)
        except AttributeError:
            print("myVar is not initialized!")

    def setMyVar(self, value):
        self.myVar = value

obj = MyClass()
obj.printMyVar()  # Prints "myVar is not initialized!"
obj.setMyVar(10)
obj.printMyVar()  # Prints 10
```


## Class Variables (Static Fields)
```cpp
#include <iostream>
using namespace std;

class MyClass {
public:
    static int staticVar; // Declaration of static member
    void printStaticVar() {
        cout << staticVar << endl;
    }
};

int MyClass::staticVar = 10; // Definition and initialization outside the class

int main() {
    MyClass obj1, obj2;
    obj1.printStaticVar(); // Prints 10
    obj2.printStaticVar(); // Prints 10
    MyClass::staticVar = 20; // Accessing static member using class name
    obj1.printStaticVar(); // Prints 20
    return 0;
}
```

```java
public class MyClass {
    public static int staticVar = 10; // Static member with initialization

    public void printStaticVar() {
        System.out.println(staticVar);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        obj1.printStaticVar(); // Prints 10
        obj2.printStaticVar(); // Prints 10
        MyClass.staticVar = 20; // Accessing static member using class name
        obj1.printStaticVar(); // Prints 20
    }
}
```

```typescript
class MyClass {
    static staticVar: number = 10; // Static field with initialization

    printStaticVar(): void {
        console.log(MyClass.staticVar); // Access using class name
    }
}

const obj1 = new MyClass();
const obj2 = new MyClass();
obj1.printStaticVar(); // Prints 10
obj2.printStaticVar(); // Prints 10
MyClass.staticVar = 20; // Accessing static field using class name
obj1.printStaticVar(); // Prints 20
```

```python
class MyClass:
    staticVar = 10  # Static field (class variable)

    def printStaticVar(self):
        print(MyClass.staticVar)  # Access using class name

obj1 = MyClass()
obj2 = MyClass()
obj1.printStaticVar()  # Prints 10
obj2.printStaticVar()  # Prints 10
MyClass.staticVar = 20  # Accessing class variable using class name
obj1.printStaticVar()  # Prints 20
```

## Local Variables
```cpp
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
```

```java
public class MyClass {
    public static void myFunction() {
        int localVar = 10; // Local variable
        System.out.println(localVar);
    }

    public static void main(String[] args) {
        myFunction(); // Prints 10
        // System.out.println(localVar); // Error: localVar cannot be resolved to a variable
    }
}
```

```typescript
function myFunction(): void {
    let localVar: number = 10; // Local variable
    console.log(localVar);
}

myFunction(); // Prints 10
// console.log(localVar); // Error: Cannot find name 'localVar'.
```

```python
def my_function():
    local_var = 10  # Local variable
    print(local_var)

my_function()  # Prints 10
# print(local_var)  # Error: NameError: name 'local_var' is not defined
```

## Parameters
```cpp
#include <iostream>
using namespace std;

void greet(std::string name) { // 'name' is a parameter
    std::cout << "Hello, " << name << "!" << std::endl; 
}

int main() {
    greet("Alice"); // 'Alice' is the actual argument passed to the function
    return 0;
}
```

```java
public class MyClass {
    public static void greet(String name) { // 'name' is a parameter
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greet("Alice"); // 'Alice' is the actual argument passed to the function
    }
}
```

```typescript
function greet(name: string): void { // 'name' is a parameter
    console.log("Hello, " + name + "!");
}

greet("Alice"); // 'Alice' is the actual argument passed to the function
```

```python
def greet(name):  # 'name' is a parameter
    print("Hello, " + name + "!")

greet("Alice")  # 'Alice' is the actual argument passed to the function
```

---