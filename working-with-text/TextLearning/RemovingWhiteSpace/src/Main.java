public class Main {
    public static void main(String[] args) {
        String firstName = "   Rob   ";
        System.out.format("'%s'", firstName);
        System.out.format("'%s'", firstName.strip()); // this is the one you should be using
        System.out.format("'%s'", firstName.stripLeading());
        System.out.format("'%s'", firstName.stripTrailing());

        System.out.println();
        String multiLine = """
                first line here
                    second line here
                third line here 
                """;

        System.out.println(multiLine.stripIndent()); // removes all leading space, but its hard to see in the IDE, but it
        // is working bruh

        String lastName = "   Smith   ";
        System.out.println(split(lastName));


    }
    public static String split(String text) {
        return text.replace(" ","");
    }
}
