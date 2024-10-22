package org.example.keyboard;

import org.example.MusicalInstrument;

import java.util.ArrayList;
import java.util.List;

public class Piano extends MusicalInstrument {
    public Piano(String name, double price, String description) {
        super(name, price, description);
    }

    public static List<MusicalInstrument> getPianoModels() {
        List<MusicalInstrument> pianos = new ArrayList<>();
        pianos.add(new Piano("Yamaha U1", 8000.0, "A classic upright piano known for its quality."));
        pianos.add(new Piano("Steinway & Sons Model D", 150000.0, "The benchmark of grand pianos, used by professionals."));
        pianos.add(new Piano("Kawai K-300", 6000.0, "A high-quality upright piano with a rich sound."));
        pianos.add(new Piano("Casio PX-160", 600.0, "A digital piano with excellent sound and portability."));
        return pianos;
    }
}

