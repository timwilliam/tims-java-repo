public class MethodParameter {
    public static void main(String[] args) {
        // parameter is also called argument
        sayHello("tim", "william");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
