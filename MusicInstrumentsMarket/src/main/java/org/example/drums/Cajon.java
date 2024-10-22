package org.example.drums;

import org.example.MusicalInstrument;

import java.util.ArrayList;
import java.util.List;

public class Cajon extends MusicalInstrument {
    public Cajon(String name, double price, String description) {
        super(name, price, description);
    }

    public static List<MusicalInstrument> getCajonModels() {
        List<MusicalInstrument> cajons = new ArrayList<>();
        cajons.add(new Cajon("Meinl CAJ1", 150.0, "A great cajon for acoustic performances."));
        cajons.add(new Cajon("LP Aspire Cajon", 120.0, "A high-quality cajon at an affordable price."));
        cajons.add(new Cajon("Schlagwerk CP 400", 200.0, "A professional cajon with excellent sound."));
        cajons.add(new Cajon("Toca Synergy Cajon", 140.0, "A stylish cajon with a unique design."));
        return cajons;
    }
}

