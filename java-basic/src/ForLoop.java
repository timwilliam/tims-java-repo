public class ForLoop {
    public static void main(String[] args) {
        // for(init statement, condition, post statement){}
        // init statement only executed once in the beginning before the for loop
        // condition will be checked in every loop iteration
        // post statement will be executed at the end of every loop iteration
        // init statement, condition, and post statement can be left empty (e.g.: for(;;){}, and it will mean always true (infinite loop)

        for(var counter = 1; counter <= 10; counter++){
            System.out.println("Iteration " + counter);
        }
    }
}
