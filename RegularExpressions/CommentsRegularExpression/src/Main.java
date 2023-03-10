import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // ?: means that the group is non-capturing
        String phoneNumRegex = """
                # Regex to parse the parts of a phone number
                ((?<countryCode>\\d{1,2})[-.,\\s]?)? # Get's the country code
                ((?<areaCode>\\d{3})[-.,\\s]?) # Get's the area code
                ((?<exchangeCode>\\d{3})[-.,+\\s]?) # Get's the exchange code
                (?<lineNumber>\\d{4}) # Get's the line number
                """;


        String phoneNumberString = "1-123-456-7890";
        System.out.println(phoneNumberString.matches(phoneNumRegex));

        Pattern phoneNumPat = Pattern.compile(phoneNumRegex, Pattern.COMMENTS); // comments also ignore whitespace
        // you input the string you want to match
        Matcher phoneNumMat = phoneNumPat.matcher(phoneNumberString);

        // check to see if the string matches the pattern
        if (phoneNumMat.matches()) {
            //shows the country code(1)
            System.out.format("Country Code: %s\n", phoneNumMat.group("countryCode"));
            //shows the area code(123)
            System.out.format("Area Code: %s\n", phoneNumMat.group("areaCode"));
            //shows the first 3 digits(456)
            System.out.format("Exchange code: %s\n", phoneNumMat.group("exchangeCode"));
            //shows the last 4 digits(7890)
            System.out.format("Line Number code: %s\n", phoneNumMat.group("lineNumber"));

            // shows the whole number
            System.out.format("Whole Number: %s\n", phoneNumMat.group(0));


        }

    }
}
