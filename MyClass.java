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
