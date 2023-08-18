package org.example;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UnSerializationTest {
    public static Object unSerialize(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)));
        return ois.readObject();
    }

    public static void main(String[] args) throws Exception {
        Person person = (Person)unSerialize("ser.bin");
        System.out.println(person);
    }
}
