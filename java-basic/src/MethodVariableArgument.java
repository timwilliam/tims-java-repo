public class MethodVariableArgument {
    public static void main(String[] args) {
        // sometimes dont know how many data to be send to a method
        // in this case, we usually use array
        // but in Java, we can use variable argument to send data with varying sizes (0 or more)
        // parameter with variable argument can only be put last in the argument brackets

        //int[] grades = {80, 50, 50, 50, 80};
        int[] grades = {80, 80, 80, 80, 80};

        // without variable argument
        sayCongrats("tim", grades);

        // with variable argument
        sayCongrats("william", 80, 50, 50, 50, 80);
    }

    // without variable argument
    // static void sayCongrats(String name, int[] grades){

    // with variable argument
    static void sayCongrats(String name, int... grades){
        var total = 0;
        for(var grade : grades){
            total += grade;
        }

        var finalGrade = total / grades.length;

        if(finalGrade >= 75){
            System.out.println("Congratulations " + name + " you pass!");
        }else{
            System.out.println("Sorry " + name + " you fail.");
        }
    }
}
