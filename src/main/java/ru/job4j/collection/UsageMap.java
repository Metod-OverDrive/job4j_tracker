package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("pochta.nadomne@mail.ru", "Ivan Ivanov");
        for (String key: map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
