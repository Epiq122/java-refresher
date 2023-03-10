public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe");
        System.out.println(person.getFirstName());

        String catPhrase = "There was cat who ate a cat who ate a cat who ate a mouse.";
        String replaceToDo = catPhrase.replace("cat", "dog");
        System.out.println(replaceToDo);


        String alphabet = "  aplhabet  ";
        String trimAlphabet = alphabet.trim().replace("t", "T");

        System.out.println(trimAlphabet);


        String address = "12345 Big St., Alphabet City, CA 90210";
        String buildingNumber = address.substring(0, 5);
        System.out.println("The building number: " + buildingNumber);
        String theStreet = address.substring(6, 13);
        System.out.println("The street: " + theStreet);
        String city = address.substring(15, 28);
        System.out.println("The city: " + city);
        String state = address.substring(30, 32).trim();
        System.out.println("The state: " + state);
        String zipCode = address.substring(33, 38);
        System.out.println("The zip code: " + zipCode);
    }
}
