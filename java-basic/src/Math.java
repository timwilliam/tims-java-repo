public class Math {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        // augmented assignment, works for +, -, *, /, %
        a += 10; // the same with a = a + 10;
        System.out.println(a);

        // unary operator, placed in front of an operator, works for ++, --, - (negative), + (positive), ! (boolean inverse)
        a++; // the same with a += 1; or a = a + 1;
        System.out.println(a);
        System.out.println(!true);
    }
}
