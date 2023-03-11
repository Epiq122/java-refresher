public class Main {
    public static void main(String[] args) {

//        System.out.println(calcPathVelocity(0.8,3));
//        System.out.println(calcCentripetalAccel(1.67,.8));
//        System.out.println(calcCentripetalForce(.2,3.504));

        System.out.println(calcCentripetalForce(.2,.8,3));
    }
    private static double calcPathVelocity(double radius, double period){
        double circumference = 2 * Math.PI * radius;
        return circumference / period;
    }

    private static double calcCentripetalAccel(double pathVel, double radius){
        return  Math.pow(pathVel,2) / radius;
    }

    private static double calcCentripetalForce(double mass, double acc){
        return mass * acc;
    }

    public static double calcCentripetalForce(double mass,double radius,double period){
        double pathVelocity = calcPathVelocity(radius,period);
        double centripetalAccel = calcCentripetalAccel(pathVelocity,radius);
        return calcCentripetalForce(mass,centripetalAccel);
    }
}
