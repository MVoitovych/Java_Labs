package ua.lviv.iot.lab2.manager;

import ua.lviv.iot.lab2.models.FishingTackle;
import ua.lviv.iot.lab2.models.TypeOfFishing;

public class Main {
    public static void main(String ...strings){
        FishingTackle fishingRod = new FishingTackle("Vudochka", "Super kruta", 1300.54F, 10, TypeOfFishing.LAKE);
        FishingTackle string = new FishingTackle("Leska", "200 kg ", 50.5F, 1, TypeOfFishing.SEA);
    }
}
