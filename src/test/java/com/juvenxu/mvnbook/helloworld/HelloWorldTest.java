package com.juvenxu.mvnbook.helloworld;

import com.juvenxu.mvnbook.helloworld.HelloWorld;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void sayHelloTest(){
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHello();
        assertEquals("Hello Maven!", result);
    }

}