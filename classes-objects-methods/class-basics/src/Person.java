import business.Company;

public class Person {
   static private Company company = new Company();
   static private Company company1 = new Company();

   // constant
    private final double PI = 3.14;

    private String firstName = "Rob";
    private int age;
    private long id;
    private char middleInitial= 'J';
    private boolean hasCar;
    private NewsAgency newsAgency;


    public static void main(String[] args) {
        System.out.println(company);
        System.out.println(company1);

    }

}

