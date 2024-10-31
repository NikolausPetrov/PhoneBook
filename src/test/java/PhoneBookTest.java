package com.example.phonebook;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int result = phoneBook.add("Alice", "12345");
        assertEquals(1, result);
    }
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "12345");
        assertEquals("Alice", phoneBook.findByNumber("12345"));
    }
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "12345");
        assertEquals("12345", phoneBook.findByName("Alice"));
    }
    public void testPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Bob", "67890");
        phoneBook.add("Alice", "12345");
        List<String> names = phoneBook.printAllNames();
        assertEquals(Arrays.asList("Alice", "Bob"), names);
    }
}