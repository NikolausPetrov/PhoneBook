package com.example.phonebook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PhoneBook {
    private Map<String, String> contacts = new HashMap<>();

    public int add(String name, String number) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, number);
        }
        return contacts.size();
    }
    public String findByNumber(String number) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(number)) {
                return entry.getKey();
            }
        }
        return null;
    }
    public String findByName(String name) {
        return null;
    }
    public List<String> printAllNames() {
        return contacts.keySet().stream().sorted().collect(Collectors.toList());
    }
}