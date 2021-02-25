package com.gbloch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloJunit4Test {
    @Test
    public void testHello() {
        assertEquals(new Hello().getHello(), "Hello");
    }
}
