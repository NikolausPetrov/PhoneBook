package com.example.phonebook;

import com.example.phonebook.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    private PhoneBook phoneBook;

    @BeforeEach
    public void setUp() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void testAdd() {
        int result = phoneBook.add("Alice", "12345");
        assertEquals(1, result);

        result = phoneBook.add("Bob", "67890");
        assertEquals(2, result);

        // Attempt to add a duplicate name
        result = phoneBook.add("Alice", "54321");
        assertEquals(2, result); // Size should not increase
    }

    @Test
    public void testFindByNumber() {
        phoneBook.add("Alice", "12345");
        phoneBook.add("Bob", "67890");

        assertEquals("Alice", phoneBook.findByNumber("12345"));
        assertEquals("Bob", phoneBook.findByNumber("67890"));
        assertNull(phoneBook.findByNumber("00000")); // Non-existent number
    }

    @Test
    public void testFindByName() {
        phoneBook.add("Alice", "12345");
        phoneBook.add("Bob", "67890");

        assertEquals("12345", phoneBook.findByName("Alice"));
        assertEquals("67890", phoneBook.findByName("Bob"));
        assertNull(phoneBook.findByName("Charlie")); // Non-existent name
    }

    @Test
    public void testPrintAllNames() {
        phoneBook.add("Bob", "67890");
        phoneBook.add("Alice", "12345");
        phoneBook.add("Charlie", "54321");

        List<String> names = phoneBook.printAllNames();
        assertEquals(Arrays.asList("Alice", "Bob", "Charlie"), names);
    }
}