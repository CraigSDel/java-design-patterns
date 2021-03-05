package creational.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryProducerTest {

    @Test
    public void getAircraftFactory() {
        AbstractFactory aircraft = FactoryProducer.getFactory("aircraft");
        assertEquals("class creational.abstractfactory.AircraftFactory", aircraft.getClass().toString());
    }
}