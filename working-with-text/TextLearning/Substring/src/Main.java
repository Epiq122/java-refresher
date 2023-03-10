public class Main {
    public static void main(String[] args) {
        String myText = "trigger";
        String myNewText = myText.substring(0, 1).toUpperCase() + myText.substring(1);
        // another way
        String myNewText2 = myText.substring(0, 1).toUpperCase().concat(myText.substring(1));


        System.out.println(myNewText);
        System.out.println(myNewText2);

        System.out.println("REFACTORING!!!");
        String firstPart = myText.substring(0, 1);
        String secondPart = myText.substring(1);
        String capitalFirstLetter = firstPart.toUpperCase();
        String myNewText3 = capitalFirstLetter.concat(secondPart);
        System.out.println(myNewText3);
        System.out.println("STRING BUILDERS!!!");
        String myNewText4 = new StringBuilder(myText.length())
                .append(capitalFirstLetter)
                .append(secondPart)
                .toString();
        System.out.println(myNewText4);


    }
}


// 0 by default shows the entire string
// 0 1 = start at 0 and give me 1 character
