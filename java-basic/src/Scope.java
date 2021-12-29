import com.sun.security.jgss.GSSUtil;

public class Scope {
    public static void main(String[] args) {
        // in Java, a variable can only be accessed inside the area in which it is created, this is called Scope
        // if a variable is created in a method, then it can only be accessed in that method
        // if a variable is created in a block, then it can only be accessed in that block

        // System.out.println(hello); // error
        sayHello("");
        sayHello("tim");
    }

    static void sayHello(String name){
        String hello = "hello " + name;

        if(!name.isBlank()){
            String hi = "hi " + name;
            System.out.println(hi);
            // System.out.println(hello); // this is ok
        } else{
            System.out.println(hello);
        }
        // System.out.println(hi); // error
    }
}
