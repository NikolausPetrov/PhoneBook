package com.example.phonebook;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int result = phoneBook.add("Alice", "12345");
        assertEquals(1, result);
    }
}