package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializationTest {
    public static void serialize(Object obj) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("ser.bin")));
        oos.writeObject(obj);
    }

    public static void main(String[] args) throws Exception {
        Person person = new Person("aaa", 22);
        serialize(person);
    }
}
