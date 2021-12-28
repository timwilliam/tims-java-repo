public class DoWhileLoop {
    public static void main(String[] args) {
        // do once, then check the condition if true or false
        var counter = 100;
        do{
            System.out.println("Iteration " + counter);
            counter++;
        }while(counter <= 10);
    }
}
