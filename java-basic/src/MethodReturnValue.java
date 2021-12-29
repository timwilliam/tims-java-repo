public class MethodReturnValue {
    public static void main(String[] args) {
        // by default, method will not produce any value
        // to return a value, we change the void keyword with the desired data type to return
        // in the method block, we return the value with the keyword 'return'
        // in Java, we can iny return 1 value

        var a = 100;
        var b = 200;
        var c= sum(a, b);

        System.out.println(c);
        System.out.println(count(a, b, "-"));
        System.out.println(count(a, b, "wrong"));
    }

    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }

    static int count(int value1, int value2, String operation){
        switch(operation){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
