public class BooleanOperation {
    public static void main(String[] args) {
        // available operator: &&, ||, !

        var attendance = 75;
        var finalGrade = 80;

        var passAttendance = attendance >= 75;
        var passFinalGrade = finalGrade >= 75;
        var passTheCourse = passAttendance && passFinalGrade;

        System.out.println(passTheCourse);
    }
}
