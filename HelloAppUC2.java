public class HelloUser {
    public static void main(String[] args) {
        // Check if an argument exists
        if (args.length > 0) {
            // args[0] is the first word typed after the command
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello User (No name provided)");
        }
    }
}