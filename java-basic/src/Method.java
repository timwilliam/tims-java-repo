public class Method {
    public static void main(String[] args) {
        // Method is a block of code that will execute when called
        // in before we use the Method println() to write something in the console
        // to make a Method, we can use the keyword void, followed by the name of the method, and then brackets and end with block
        // we can call a Method with its name followed by brackets ()
        // in other programming language, Method is also called Function

        sayHelloWorld();
    }

    // method name starts with lowercase, then capitalize each word after that
    // a static method can only be called by another static method
    static void sayHelloWorld(){
        System.out.println("Hello World!");
    }
}
