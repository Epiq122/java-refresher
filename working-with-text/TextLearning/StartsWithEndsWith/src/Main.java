public class Main {
    public static void main(String[] args) {
        String filename ="C:\\Users\\joe\\Documents\\MyFile.txt";
        System.out.println(filename.endsWith(".txt"));

        String filename2 = "   file001.txt".trim();
        System.out.println(filename2.startsWith("file"));

    }
}
