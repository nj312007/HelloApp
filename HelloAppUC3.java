public class HelloDefault {
    public static void main(String[] args) {
        // Use ternary operator: If length > 0, use args[0], else use "World"
        String name = (args.length > 0) ? args[0] : "World";
        
        System.out.println("Hello " + name);
    }
}