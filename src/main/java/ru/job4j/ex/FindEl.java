package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        if (value[0] == null) {
            throw new ElementNotFoundException("Array is null");
        }
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"1", "2", "3", "4"};
        try {
            System.out.println(FindEl.indexOf(value, "2"));
        } catch (ElementNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}