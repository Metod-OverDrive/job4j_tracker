package ru.job4j.stream;

import java.util.List;

public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        return products.stream()
                .filter(el -> el.getStandard() - el.getActual() >= 0)
                .filter(el -> el.getStandard() - el.getActual() <= 3)
                .map(el -> new Label(el.getName(), (el.getPrice()) * 0.5F)).map(el -> el.toString()).toList();
    }
}