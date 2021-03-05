package creational.builder;

import java.time.LocalDate;

public class Pilot {
    private String name;
    private PilotType pilotType;
    private Double numberOfHours;
    private LocalDate dateOfBirth;

    public Pilot() {
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", pilotType=" + pilotType +
                ", numberOfHours=" + numberOfHours +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public static class Builder {
        private String name;
        private PilotType pilotType;
        private Double numberOfHours;
        private LocalDate dateOfBirth;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder pilotType(PilotType pilotType) {
            this.pilotType = pilotType;
            return this;
        }

        public Builder numberOfHours(Double numberOfHours) {
            this.numberOfHours = numberOfHours;
            return this;
        }

        public Builder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Pilot build() {
            Pilot pilot = new Pilot();
            pilot.name = this.name;
            pilot.pilotType = this.pilotType;
            pilot.numberOfHours = this.numberOfHours;
            pilot.dateOfBirth = this.dateOfBirth;
            return pilot;
        }
    }
}
