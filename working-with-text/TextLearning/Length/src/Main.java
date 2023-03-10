public class Main {
    public static void main(String[] args) {
        String myText = "I hate myself for loving you, doing the same things that i wanna do ";
        System.out.println(myText.length());
        char[] chars = myText.toCharArray();
        int index = 80;
        if(index < myText.length()){
        System.out.println(chars[index]);
        }else{
            System.out.println("Bruh thats not even in there bruh");
        }

        String myText2 = "Dyre";
        String myText3 = "Maker";
        StringBuilder builder = new StringBuilder(myText2.length()+myText3.length()).append(myText2).append(myText3);
        System.out.println(builder.toString());

    }
}
