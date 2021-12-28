public class SwitchStatement {
    public static void main(String[] args) {
        var grade = "B";

        switch(grade){
            case "A":
                System.out.println("You pass the course with very good grades!");
                break;
            case "B":
            case "C":
                System.out.println("You pass the course");
                break;
            case "D":
                System.out.println("You fail the course");
                break;
            default:
                System.out.println("You should try again next time");
        }

        // switch statement with lambda (since Java14, so that we don't have to use break
        grade = "D";
        switch(grade){
            case "A" -> System.out.println("You pass the course with very good grades!");
            case "B", "C" -> System.out.println("You pass the course");
            case "D" -> System.out.println("You fail the course");
            default -> {
                // if there is more than one Statement, you can use Block
                System.out.println("You should try again next time");
            }
        }

        // switch statement with yield (since Java14)
        grade = "A";
        String phrase = switch(grade){
            case "A":
                yield "You pass the course with very good grades!";
            case "B", "C":
                yield "You pass the course";
            case "D":
                yield "You fail the course";
            default:
                yield "You should try again next time";
        };
        System.out.println(phrase);
    }
}
