public class HelloMultiple {
    public static void main(String[] args) {
        if (args.length > 0) {
            // Loop through each name provided in the arguments
            for (String name : args) {
                System.out.println("Hello " + name);
            }
        } else {
            // Default case if no names are provided
            System.out.println("Hello World");
        }
    }
}