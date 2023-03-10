import model.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Person rob = new Person("rob", "gleason", LocalDate.of(1986, 9, 5));
        System.out.format("The person's first name is: %s ", rob.getFirstName());
        rob.setLastName("gleason");
        System.out.format("The person's last name is: %s ", rob.getLastName());

    }
}
