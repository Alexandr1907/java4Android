package lesson10.homeWork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private final Map<String, Set<String>> book = new HashMap<>();

    public void add(String name, String phoneNumber) {
        Set<String> phones;
        if (book.containsKey(name)){
            phones = book.get(name);
            phones.add(phoneNumber);
        } else {
            phones = new HashSet<>();
            phones.add(phoneNumber);
            book.put(name, phones);
        }
    }

    public Set<String> get(String name){
        return book.get(name);
    }
}
