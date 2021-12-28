public class Variable {
    public static void main(String[] args) {
        // Java is static type, a variable can only be used to store variable of same type
        // A variable name can't contain spaces, and can't consist of only numbers
        String name = "Tim William";
        int age = 26;

        System.out.println(name);
        System.out.println(age);

        name = "Budi Kurniawan";
        System.out.println(name);

        // Since Java10, Java supports variable declaration with var
        // With var declaration, value of the variable needs to be assigned during declaration
        var text = "This var value is assigned at declaration";
        System.out.println(text);

        // By default, a value of a variable can be updated
        // With the keyword 'final' you can make it constant
        final String finalText = "I am the same for all eternity";
        System.out.println(finalText);
    }
}
