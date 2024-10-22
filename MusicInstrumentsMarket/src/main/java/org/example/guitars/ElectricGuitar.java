package org.example.guitars;

import org.example.MusicalInstrument;

import java.util.ArrayList;
import java.util.List;

public class ElectricGuitar extends MusicalInstrument {
    public ElectricGuitar(String name, double price, String description) {
        super(name, price, description);
    }

    public static List<MusicalInstrument> getElectricGuitarModels() {
        List<MusicalInstrument> electricGuitars = new ArrayList<>();
        electricGuitars.add(new ElectricGuitar("Fender Stratocaster", 1200.0, "Iconic electric guitar known for its bright tone."));
        electricGuitars.add(new ElectricGuitar("Gibson Les Paul", 2500.0, "Classic rock guitar with thick, powerful sound."));
        electricGuitars.add(new ElectricGuitar("Ibanez RG", 1500.0, "Popular among metal players for its fast neck."));
        electricGuitars.add(new ElectricGuitar("Yamaha Pacifica", 600.0, "Affordable guitar with versatile sound for beginners."));
        return electricGuitars;
    }
}

