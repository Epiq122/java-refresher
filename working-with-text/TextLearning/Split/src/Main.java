public class Main {
    public static void main(String[] args) {
      String text = """
              Smith,Fred,1/1/79,1111 ABC St.,Apple,CA
              McGuire,Jerry,2/2/80,2222 DEF St.,Orange,NV
              Flinstone,Fred,3/3/81,3333 GHI St.,Pear,MO
              Rubble,Barney,4/4/82,4444 JKL St.,Pineapple,IL
              Jetson,George,5/5/83,5555 MNO St.,Grapefruit,Ny
               """;


        String[] people = text.split("\n"); // split the text into an array of strings
        System.out.println(people.length);// 5
        System.out.println(people[2]);
        String[] fred = people[2].split(","); // split the text into an array of strings
        System.out.println(fred[3]); // 3333 GHI St.

    }
}


