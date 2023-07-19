package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
class SomeClassTest {

    SomeClass someClass = new SomeClass();

    @Test
    void testHello(){
        String expected = "abcd";
        String actual = someClass.sayHello();

        assertEquals(expected, actual);
    }

}
