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

        int ageThisYear = 30;

        int ageNextYear = ageThisYear + 1;

        System.out.println("age = " + ageNextYear);

    }
}
