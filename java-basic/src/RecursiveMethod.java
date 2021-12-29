public class RecursiveMethod {
    public static void main(String[] args) {
        var factorial = getFactorialLoop(5);
        System.out.println("Result is " + factorial);

        factorial = getFactorialRecursive(6);
        System.out.println("Result is " + factorial);

        // beware that in every method call, Java wil store it in a stack
        // if we keep calling a method, then the stack will grow and if it is too big then there will be StackOverflow
        // be careful when using recursive method call!
    }

    static int getFactorialLoop(int value){
        var factorial = 1;

        while (value > 0) {
            factorial *= value;
            value--;
        }

        return factorial;
    }

    static int getFactorialRecursive(int value){
        // needs exit condition, otherwise infinite loop
        if(value == 1){
            return 1;
        }else{
            return value * getFactorialRecursive(value-1);
        }
    }
}
