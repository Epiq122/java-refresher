public class LearnStrings {
    public static void main(String[] args) {
       String fruit = "grapes";
       String anotherFruit = "grapes";
       String meat = new String("steak");
       String anotherMeat = new String("steak");


        System.out.println(fruit == anotherFruit); // these are both in the same spot in memory
        System.out.println(meat == anotherMeat); // these are in seperate parts in memory because it used the New operator.
    }
}
