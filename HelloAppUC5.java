public class HelloEnhanced {
    public static void main(String[] args) {
        // Requirement: Default to "World" if no args provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Concept: Enhanced for-loop (for-each)
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
}