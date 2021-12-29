public class ForEach {
    public static void main(String[] args) {
        // useful when accessing elements in an array
        // for each will help in getting all of the data in an array

        String[] names = {
                "tim", "william",
                "java", "basic"
        };

        // usually this is how you access each element in an array
        for(var counter = 0; counter < names.length; counter++){
            System.out.println(names[counter]);
        }

        // now, the same thing, but with using for each
        for(var name: names){
            System.out.println(name);
        }
    }
}
