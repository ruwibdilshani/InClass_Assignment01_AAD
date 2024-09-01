package lk.ijse.inclass;

import lk.ijse.inclass.DTO.FoodItem;


public class PreferenceService {

    private final Kashul kashul;

    public PreferenceService() {
        this.kashul = new Kashul();
    }

    public void addPreference(FoodItem foodItem) {
        kashul.addPreference(foodItem);
    }

    public Kashul getKashul() {
        return kashul;
    }
}