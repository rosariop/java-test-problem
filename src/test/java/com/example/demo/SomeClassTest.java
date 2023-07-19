package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
class SomeClassTest {

    SomeClass someClass = new SomeClass();

    @Test
    void testHello() throws NoSuchFieldException, IllegalAccessException {
        Field keyField = SomeClass.class.getDeclaredField("key");
        keyField.setAccessible(true);
        keyField.set(someClass, "abcd");

        String expected = "abcd";
        String actual = someClass.sayHello();

        assertEquals(expected, actual);
    }

}
