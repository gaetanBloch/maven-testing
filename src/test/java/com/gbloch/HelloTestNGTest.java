package com.gbloch;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HelloTestNGTest {

    @Test
    public void testGetHello() {
        // Given
        Hello hello = new Hello();

        // When
        String result = hello.getHello();

        // Then
        assertEquals(result, "Hello");
    }
}
