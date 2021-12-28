public class StringType {
    public static void main(String[] args) {
        String firstName = "Tim";
        String lastName = "William";

        System.out.println(firstName);
        System.out.println(lastName);

        java.lang.String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // Note that String is not a primitive data type, default value is NULL
        // String is a object data type
    }
}
