package creational.builder;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        Pilot john_doe = new Pilot.Builder()
                .name("John Doe")
                .dateOfBirth(LocalDate.of(1996, 6, 18))
                .pilotType(PilotType.FIGHTER)
                .numberOfHours(26.2)
                .build();
        System.out.println(john_doe);
    }
}
