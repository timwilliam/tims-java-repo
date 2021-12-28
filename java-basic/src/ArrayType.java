public class ArrayType {
    public static void main(String[] args) {
        // Array is a collection of data with the same data type
        // - First index starts at 0

        String[] stringArray = new String[3];
        stringArray[0] = "Tim";
        stringArray[1] = "William";

        System.out.println(stringArray[0]);

        // Create array with initializer
        // int[] intArray = {} // alternative, shorter
        int[] intArray = new int[]{
                10, 90, 80, 67
        };

        // array[index]         : to take the value in array
        // array[index] = value : to update the data in array
        // array.length         : to get the length of an array
        System.out.println(intArray.length);

        // In Java we can't really delete an element in an array, but we can set it to 0, or NULL (empty the element)

        // Array inside another array
        String[][] members = {
                {"Tim", "William"},
                {"Budi", "Kurniawan"},
                {"Cinta", "Laura"}
        };

        System.out.println(members[0][0] + " " + members[0][1]);
    }
}
