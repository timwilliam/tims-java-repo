public class IfStatement {
    public static void main(String[] args) {
        // 'if' is used to create a branch in code execution
        // 'if' is executed when a condition is met

        var grade = 70;
        var attendance = 90;

        if(grade >= 80 && attendance >= 80){
            System.out.println("Your grade is A");
        }else if(grade >= 70 && attendance >= 70){
            System.out.println("Your grade is B");
        }else if(grade >= 60 && attendance >= 60){
            System.out.println("Your grade is C");
        }else if(grade >= 50 && attendance >= 50){
            System.out.println("Your grade is D");
        }else{
            System.out.println("You grade is E");
        }
    }
}
