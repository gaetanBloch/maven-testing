package com.gbloch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloJunit4Test {
    @Test
    public void getHello() {
        // Given
        Hello hello = new Hello();

        // When
        String result = hello.getHello();

        // Then
        assertEquals(result, "Hello");
    }
}
