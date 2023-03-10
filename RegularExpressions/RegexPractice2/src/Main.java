public class Main {
    public static void main(String[] args) {
        System.out.println("Lat".matches("\\wat")); // match on any word with 1 character and a at the end
        System.out.println("pat".matches("\\w\\w\\w")); // match on any 3 word character


        System.out.println("1".matches("\\d")); // match on any digit ( string )
        System.out.println("1".matches("\\d\\d\\d")); // match on any 3 digit ( string )

        // match a phone number
        System.out.println("123-456-7890".matches("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d"));
        System.out.println("123-456-7890".matches("\\d{3}-\\d{3}-\\d{4}"));

        // match a phone number with .
        System.out.println("123.456.7890".matches("\\d{3}\\.\\d{3}\\.\\d{4}"));

        // match a phone number with . or -
        System.out.println("123-456.7890".matches("\\d{3}[.-]\\d{3}[.-]\\d{4}"));

        // match a phone number with . or - ,
        System.out.println("123.456.7890".matches("\\d{3}[-.,]\\d{3}[-.,]\\d{4}"));

        // match a phone number with . or - , space
        System.out.println("123 456.7890".matches("\\d{3}[-.,\\s]\\d{3}[-.,\\s]\\d{4}"));

        // match a phone number with . or - , space with extra space  --- + = 1 or more of the characters
        System.out.println("123    456.7890".matches("\\d{3}[-.,\\s]+\\d{3}[-.,\\s]+\\d{4}"));

        // match phone number with 0 more spaces --- * = 0 or more of the characters   * = 0 or more
        System.out.println("123456.7890".matches("\\d{3}[-.,\\s]*\\d{3}[-.,\\s]*\\d{4}"));

        // match a phone number with()
        System.out.println("(123)-456-7890".matches("\\(\\d{3}\\)-\\d{3}-\\d{4}"));

        // match phone number with 0 or 1 space - not more than 1
        System.out.println("123 456.7890".matches("\\d{3}[-.,\\s]?\\d{3}[-.,\\s]?\\d{4}"));

        // match phone number where last 3 digits could be more
        System.out.println("123 456.7890412".matches("\\d{3}[-.,\\s]?\\d{3}[-.,\\s]?\\d{3,4}"));

        // grouping digits and 3 digits and a space 2x and 4 digits at the end
        System.out.println("321 333 2365".matches("(\\d{3}[-.,\\s]?){2}\\d{4}"));

        // grouping digits and 3 digits and a space 1x or 2x and 4 digits at the end
        System.out.println("321 333 2365".matches("(\\d{3}[-.,\\s]?){1,2}\\d{4}"));

        //   grouping digits and 3 digits and a space 1x or 2x and 4 digits at the end with extra number at the start

        System.out.println("1 321 333 2365".matches("\\d[-.,\\s](\\d{3}[-.,\\s]?){1,2}\\d{4}"));


        //   grouping digits and 3 digits and a space 1x or 2x and 4 digits at the end with extra number at the start
        //   optional ( and has to be a 1 a the start
        System.out.println("1 321 333 2365".matches("(1[-.,\\s]?)?(\\d{3}[-.,\\s]?){1,2}\\d{4}"));


    }
}
