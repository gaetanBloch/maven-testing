package com.gbloch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloJunit5Test {
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
