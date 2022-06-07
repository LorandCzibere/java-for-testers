package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    @Test
    public void declaringNumericalVariables() {

        final int ageThisYear = 30;

        int ageNextYear = ageThisYear + 1;

        double weight = 15.5;

        System.out.println("age = " + ageNextYear);

    }

    @Test
    public void workingWithString() {

        String firstName = " Sarah-Jane ";

        String upperCaseFirstName = firstName.replace("Sarah", "Mary");

        System.out.println(firstName.trim());
    }
}
