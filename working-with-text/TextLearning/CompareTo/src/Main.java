public class Main {
    public static void main(String[] args) {
        String firstWord = "Apple";
        String secondWord = "apple";
        System.out.println(firstWord.compareTo(secondWord));
        System.out.println(firstWord.compareToIgnoreCase(secondWord));
        System.out.println(compareToIgnoreCase(firstWord, secondWord));
    }

    // implement the method compareToIgnoreCase here
    public static int compareToIgnoreCase(String firstWord, String secondWord) {
        return firstWord.toLowerCase().compareTo(secondWord.toLowerCase());
    }
}
