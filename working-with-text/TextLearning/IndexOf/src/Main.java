public class Main {
    public static void main(String[] args) {
        String myText = "four score and seven years ago";
        String myWord = "seven";

        int myIndex = myText.indexOf(myWord); // 15
        System.out.println(myIndex);

        String myText2 = "ABCDEFGABCDEFG";
        System.out.println(myText2.indexOf(65)); // This is a A in the string 0 , only the first one
        System.out.println(myText2.indexOf(122)); // This is a z in the string -1 , not in the string
        System.out.println(myText2.lastIndexOf("A")); // This is a A in the string 7 , last one
        System.out.println(myText2.indexOf("A", 2));// start from C and find A after that


        String phoneNumber = "(234) 333-5551";
        String areaCode = phoneNumber.substring(1, 4);
        String exchange = phoneNumber.substring(6, 9);
        String number = phoneNumber.substring(10);
        System.out.println(areaCode);
        System.out.println(exchange);
        System.out.println(number);

        System.out.println(parseAreaCode(phoneNumber));
        System.out.println(parseExchange(phoneNumber));
        System.out.println(parseLineNumber(phoneNumber));

    }

    public static String parseAreaCode(String phoneNumber) {
        int openParen = phoneNumber.indexOf("(");
        int closeParen = phoneNumber.indexOf(")");
        return phoneNumber.substring(openParen + 1, closeParen);
    }

    public static String parseExchange(String phoneNumber) {
        int spaceIdx = phoneNumber.indexOf(" ");
        int hyphenIdx = phoneNumber.indexOf("-");
        return phoneNumber.substring(spaceIdx + 1, hyphenIdx);

    }

    public static String parseLineNumber(String phoneNumber) {
        int hyphenIdx = phoneNumber.indexOf("-");
        return phoneNumber.substring(hyphenIdx + 1);
    }

}
