package creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonClassTest {

    @Test
    public void increaseTheNumberOfCallsEachTimeTheGetMessageIsCalled(){
        SingletonClass instance = SingletonClass.getInstance();
        assertEquals("How many times I have been called 1", instance.getMessage());
        assertEquals("How many times I have been called 2", instance.getMessage());
        assertEquals("How many times I have been called 3", instance.getMessage());
    }
}