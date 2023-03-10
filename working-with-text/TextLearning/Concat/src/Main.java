public class Main {
    public static void main(String[] args) {
        String text1 = "this is my text1";
        String text2 = "this is my text2";
        System.out.println(text1 + text2);
        System.out.println(text1 + " " + text2);

        System.out.println("----------");
        String text3 = "this is my text3";
        String text4 = "this is my text4";
        System.out.println(text3.concat(text4));
        System.out.println(text3.concat(" ").concat(text4));


        System.out.println("----------");
        String text5 = "this is my text5";
        String text6 = "this is my text6";
        String text7 = "this is my text7";
        String text8 = "this is my text8";

        // you dont need to show the capcity of the string

        String finalString = new StringBuilder(text5.length()+text6.length()+text7.length()+text8.length() + 1).append(text5)
                                                .append(" ")
                                                .append(text6)
                                                .append(" ")
                                                .append(text7)
                                                .append(" ")
                                                .append(text8)
                                                .toString();
        System.out.println(finalString);

        // this is the same as the above code but its older code.
        String otherFinalString = new StringBuffer().append(text5)
                                                    .append(" ")
                                                    .append(text6)
                                                    .append(" ")
                                                    .append(text7)
                                                    .append(" ")
                                                    .append(text8)
                                                    .toString();
        System.out.format("%s %s %s %s", text5, text6, text7, text8);
    }
}
