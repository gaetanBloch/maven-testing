package com.gbloch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloJunit5Test {
    @Test
    void getHello() {
        assertEquals(new Hello().getHello(), "Hello");
    }
}
