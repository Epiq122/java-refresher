import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


/*
* 2. Create an array and initialize it with the days of the week.
* 2.1.Use System.out.println() to print:
    2.1.1.The number of items in the array
    * 2.1.2.The 4th day in the array
*
*
* */
        System.out.println("-----QUESTION 2------");
        String[] daysOfWeek = new String[]{"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        System.out.println(daysOfWeek.length);

        System.out.println(daysOfWeek[3]);


        // 3. Create an array and initialize it with numbers, 1-10.
        System.out.println("-----QUESTION 3------");

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(nums.length);


        // 4. Try creating an array to represent the tic-tac-toe board to the right.
        //4.1.How would you access the value in the bottom right square with Java code?
        System.out.println("-----QUESTION 4------");


        String[][] board = {{"0", "X", "X"},
                {"X", "0", "0"},
                {"X", "0", "0"}};
        System.out.println(Arrays.deepToString(board));
        // get bottom right
        System.out.println(board[2][2]);

        System.out.println("-----QUESTION 5------");
        System.out.println(printStrings("Larry","Mo","Curly"));


        System.out.println("-----QUESTION 6------");
        int result = MyMathUtils.add(2, 3);
        System.out.println(result);


    }


    // 5. Write a method that allows you to pass any number of Strings as parameter inputs without using an array.
    public static String printStrings(String... strings) {

        for (String s : strings) {
            System.out.println(s);
        }
        return null;
    }


    // 6. How can you create a method that can be called without creating an instance of its class?
    public class MyMathUtils {
        public static int add(int a, int b) {
            return a + b;
        }
    }

}



