public class Main {
    public static void main(String[] args) {
        System.out.println(areaOfACircle(3));
    }


    /**
     * Calculates the area of a circle
     * It uses the formula: A = pi * r^2
     * @param radius
     * @return
     */
    public static double areaOfACircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
