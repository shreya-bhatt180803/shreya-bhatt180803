package com.myproject.pipeshreya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void testCorrectInput() {
        Person person = new Person();
        String response = person.generateResponse("shreya", 1808);
        assertEquals("Correct Response", response);
    }

    @Test
    public void testIncorrectInput() {
        Person person = new Person();
        String response = person.generateResponse("john", 1234);
        assertEquals("Incorrect Response", response);
    }
}
