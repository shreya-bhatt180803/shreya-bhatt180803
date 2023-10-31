package com.myproject.pipeshreya;

public class Person {
    public String generateResponse(String name, int id) {
        if ("shreya".equals(name) && id ==1808) {
            return "Correct Response";
        } else {
            return "Incorrect Response";
        }
    }
}
