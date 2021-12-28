import java.util.Date;

public class ExpressionStatementBlock {
    public static void main(String[] args) {
        // Expression is a constructor from a variable, operator and method call that evaluates into a single value
        // Expression is a core component from a statement
        int value; // is an Expression
        value = 100; // is an Expression
        System.out.println(value = 100); // is an Expression inside a System.out.println() Statement

        // Statement is like a complete sentence in programming language
        // Statement contains a complete execution and ends with a semicolon
        // different types of Statement: Assignment expression, unary operator, method invocation, object creation expression
        // Statement is a collection of Expression
        double aValue = 8933.234; // assignment Statement
        aValue++; // increment Statement
        System.out.println("Hello World!"); // method invocation Statement
        Date date = new Date(); // object creation Statement

        // Block is a collection of 0 or more Statement
        // Block starts with curly brackets {}
        // there can be Block inside another Block
        // example of Block will be what written in this code, from line 4 -  24
    }
}
