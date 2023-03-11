public class Main {
    public static void main(String[] args) {
        System.out.println( 3 + 5);
        System.out.println( 3 - 5);
        System.out.println( 3 * 5);
        System.out.println( 3 / 5);
        System.out.println( 3 % 5);
        System.out.println( 3.0 / 5);
        System.out.println( 3 / 5.0);

        // ++ and -- increment and decrement
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);
        System.out.println(x--);
        System.out.println(x);
        System.out.println(--x);
        System.out.println(x);


        // +=, -=, *=, /=, %=, <<=, >>=, &=, ^=, |=
        int y = 5;
        y += 5;
        System.out.println(y);
        y -= 5;
        System.out.println(y);
        y *= 5;
        System.out.println(y);
        y /= 5;
        System.out.println(y);
        y %= 5;
        System.out.println(y);
        y <<= 5;
        System.out.println(y);
        y >>= 5;
        System.out.println(y);
        y &= 5;
        System.out.println(y);
        y ^= 5;
        System.out.println(y);
        y |= 5;
        System.out.println(y);


    }
}
