public class Main {
    public static void main(String[] args) {
        System.out.println("cat".matches("cat")); // true
        System.out.println("Cat".matches("cat")); // false
        System.out.println("Alpha".matches("[aA]lpha")); // true
        System.out.println("alpha".matches("[aA]lpha")); // true

        System.out.println("bat".matches("[a-f]at"));
        System.out.println("bat".matches("[a-fA-F]at")); // lowercase a - f, uppercase A - F
        System.out.println("cat".matches("[^c]at")); // allow anything except lowercase c ^ means not
        System.out.println("Bat".matches("[^a-z]at")); // allow anything except lowercase a - z



    }
}
