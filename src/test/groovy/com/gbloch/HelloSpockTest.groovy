package com.gbloch

import spock.lang.Specification

class HelloSpockTest extends Specification {
    def "GetHello"() {
        given:
            def hello = new Hello()

        when:
            def result = hello.hello

        then:
            result == "Hello"
    }
}
