public class TernaryOperator {
    public static void main(String[] args) {
        // simple operator, just like if statement
        // if the condition is true, the first value will be taken, otherwise, the second value will be taken

        var grade = 75;
        String phrase = grade >= 75 ? "You pass the course!" : "You fail the course";

        System.out.println(phrase);
    }
}
