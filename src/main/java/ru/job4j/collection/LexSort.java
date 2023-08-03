package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftParts = left.split(" ");
        String[] rightParts = right.split(" ");
        String[] leftRes = (leftParts[0].split("\\."));
        String[] rightRes = (rightParts[0].split("\\."));
        int minLength = Math.min(leftRes.length, rightRes.length);
        for (int i = 0; i < minLength; i++) {
            int result = leftRes[i].compareTo(rightRes[i]);
            if (result != 0) {
                return result;
            }
        }
        return leftRes[0].compareTo(rightRes[0]);
    }
}