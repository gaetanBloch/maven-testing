package com.gbloch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloIT {
    @Test
    void getHello() {
        // Given
        Hello hello = new Hello();

        // When
        String result = hello.getHello();

        // Then
        assertEquals(result, "Hello");
    }
}
