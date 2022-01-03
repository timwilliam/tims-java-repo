public class BooleanOperation {
    public static void main(String[] args) {
        // available boolean operator: &&, ||, !

        // AND &&
        // 0 && 0 = false; 0 && 1 = false; 1 && 0 = false; 1 && 1 = true

        // OR ||
        // 0 || 0 = false; 0 || 1 = true; 1 || 0 = true; 1 || 1 = true

        // NOT !
        // !0 = true; !1 = false

        var attendance = 75;
        var finalGrade = 80;

        var passAttendance = attendance >= 75;
        var passFinalGrade = finalGrade >= 75;
        var passTheCourse = passAttendance && passFinalGrade;

        System.out.println(passTheCourse);
    }
}
