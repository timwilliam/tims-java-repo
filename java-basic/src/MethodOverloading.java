public class MethodOverloading {
    public static void main(String[] args) {
        // with method overloading, you can make a method with the same name more than once
        // with a catch, each method should have different parameters
        // error will occur if 2 method has the same parameters

        sayHello();
        sayHello("tim");
        sayHello("tim", "william");
    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String firstName){
        System.out.println("Hello " + firstName);
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
