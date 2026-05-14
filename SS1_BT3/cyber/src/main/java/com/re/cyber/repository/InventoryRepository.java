package com.re.cyber.repository;

import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class InventoryRepository {
    private Map<String, Integer> stock = new HashMap<>();

    public InventoryRepository() {
        stock.put("Mì xào bò", 5);
        stock.put("Sting", 10);
    }

    public int getStock(String foodName) {
        return stock.getOrDefault(foodName, 0);
    }

    public void updateStock(String foodName, int quantity) {
        stock.put(foodName, stock.get(foodName) - quantity);
    }
}

