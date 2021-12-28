public class BreakContinue {
    public static void main(String[] args) {
        // break stops all loop iteration
        // continue only stops the current iteration, then proceeds to the next iteration
        var counter = 1;
        while(true){
            System.out.println("Iteration " + counter);
            counter++;

            if(counter > 10){
                break;
            }
        }

        for(counter = 1; counter <= 100; counter++){
            if(counter % 2 == 0){
                continue;
            }

            System.out.println("Odd repetition " + counter);
        }
    }
}
