# LightUpTheNewWorld-Basic : Chapter-4 Access Modifier

## Private Access Modifier
```cpp
#include <iostream>
using namespace std;

class MyClass {
private:
    int myPrivateVar;

    void privateMethod() {
        cout << "This is a private method." << endl;
    }

public:
    MyClass() : myPrivateVar(10) {}

    void showVar() {
        cout << myPrivateVar << endl;
        privateMethod();
    }
};

int main() {
    MyClass obj;
    obj.showVar();
    // obj.privateMethod(); // Error: privateMethod() is private within this context
    return 0;
}
```

```java
public class MyClass {
    private int myPrivateVar = 10;

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    public void showVar() {
        System.out.println(myPrivateVar);
        privateMethod();
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showVar();
        // obj.privateMethod(); // Error: privateMethod() has private access in MyClass
    }
}
```

```typescript
class MyClass {
    private myPrivateVar: number = 10;

    private privateMethod(): void {
        console.log("This is a private method.");
    }

    showVar(): void {
        console.log(this.myPrivateVar);
        this.privateMethod();
    }
}

const obj = new MyClass();
obj.showVar();
// obj.privateMethod(); // Error: Property 'privateMethod' is private and only accessible within class 'MyClass'.
```

```python
class MyClass:
    def __init__(self):
        self.__myPrivateVar = 10

    def __private_method(self):
        print("This is a private method.")

    def show_var(self):
        print(self.__myPrivateVar)
        self.__private_method()

obj = MyClass()
obj.show_var()
# obj.__private_method()  # Error: 'MyClass' object has no attribute '__private_method'
```

## Default Access Modifier (no access modifier specified)
```cpp
class MyClass {
    int defaultAttribute;  // private by default

    void defaultMethod() { // private by default
        std::cout << "Inside defaultMethod with attribute value: " << defaultAttribute << std::endl;
    }

public:
    void setAttribute(int value) {
        defaultAttribute = value;
    }

    void callDefaultMethod() {
        defaultMethod();
    }
};
```

```java
package mypackage;

class MyClass {
    int defaultAttribute;  // package-private by default

    void defaultMethod() { // package-private by default
        System.out.println("Inside defaultMethod with attribute value: " + defaultAttribute);
    }

    public void setAttribute(int value) {
        defaultAttribute = value;
    }

    public void callDefaultMethod() {
        defaultMethod();
    }
}
```

```typescript
class MyClass {
    defaultAttribute: number;  // public by default

    defaultMethod(): void {    // public by default
        console.log("Inside defaultMethod with attribute value:", this.defaultAttribute);
    }

    setAttribute(value: number): void {
        this.defaultAttribute = value;
    }
}
```

```python
class MyClass:
    defaultAttribute = 10  // public by default

    def defaultMethod(self):  // public by default
        print(f"Inside defaultMethod with attribute value: {self.defaultAttribute}")

    def setAttribute(self, value):
        self.defaultAttribute = value
```

## Protected Access Modifier
```cpp

```














