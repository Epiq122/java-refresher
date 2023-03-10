public class Main {
    public static void main(String[] args) {
      String firstText = "Apple";
        String secondText = "Apple";
        System.out.println(firstText.contentEquals(secondText)); // true

        // Preffered method
        System.out.println(firstText.equals(secondText)); // will only work if there both the same and strings

    }
}
