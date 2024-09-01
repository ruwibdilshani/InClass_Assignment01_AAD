package lk.ijse.inclass;

import lk.ijse.inclass.DTO.FoodItem;

import java.util.ArrayList;
import java.util.List;

public class Kashul {
    private List<FoodItem> preferences = new ArrayList<>();

    public List<FoodItem> getPreferences() {
        return preferences;
    }

    public void addPreference(FoodItem foodItem) {
        preferences.add(foodItem);
    }
}