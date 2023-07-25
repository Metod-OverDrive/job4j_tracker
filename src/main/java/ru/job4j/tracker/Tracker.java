package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[100];
        int resultSize = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                result[i] = items[i];
                resultSize++;
            }
        }
        return Arrays.copyOf(result, resultSize);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        boolean result = false;
        int index = this.indexOf(id);
        boolean valid = index != -1;
        if (valid) {
            item.setId(id);
            items[index] = item;
            result = true;
        }
        return result;
    }

    public boolean delete(int id) {
        boolean result = false;
        int index = this.indexOf(id);
        boolean valid = index != -1;
        if (valid) {
            int length = this.size - index - 1;
            System.arraycopy(items, index, items, index + 1, length);
            items[size - 1] = null;
            size--;
        }
        return result;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}