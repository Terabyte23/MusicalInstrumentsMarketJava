package org.example.keyboard;

import org.example.MusicalInstrument;

import java.util.ArrayList;
import java.util.List;

public class Organ extends MusicalInstrument {
    public Organ(String name, double price, String description) {
        super(name, price, description);
    }

    public static List<MusicalInstrument> getOrganModels() {
        List<MusicalInstrument> organs = new ArrayList<>();
        organs.add(new Organ("Hammond B-3", 4000.0, "A classic electric organ known for its rich sound."));
        organs.add(new Organ("Yamaha YC61", 2000.0, "A versatile stage organ with various sounds."));
        organs.add(new Organ("Roland VR-09", 1500.0, "A performance-oriented organ with modern features."));
        organs.add(new Organ("Nord C2D", 3500.0, "A digital organ with an authentic sound and feel."));
        return organs;
    }
}

