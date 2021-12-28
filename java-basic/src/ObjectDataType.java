public class ObjectDataType {
    public static void main(String[] args) {
        // Object data type default value is NULL, and needs to be initialized

        Integer itsInt = 100;

        System.out.println(itsInt);

        int itsPrimitiveInt = 100;
        Integer itsInt2 = itsPrimitiveInt;
        System.out.println(itsInt2);

        int age = 30;
        Integer ageObject = age;

        // Object has methods
        // use shortValue() method for helping with the conversion
        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
    }
}
