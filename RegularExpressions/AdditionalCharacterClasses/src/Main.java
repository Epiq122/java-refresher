public class Main {
    public static void main(String[] args) {

        // . matches one character except a new line
        System.out.println("hockey".matches("."));
        //.* matches any characters
        System.out.println("hockey".matches(".*"));
        // .? matches zero or one character
        System.out.println("hockey".matches(".?"));
        // ^ match a characters thats not in the set
        System.out.println("hockey".matches("[^abcd]"));
    }
}
