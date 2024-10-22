package org.example.drums;

import org.example.MusicalInstrument;

import java.util.ArrayList;
import java.util.List;

public class SnareDrum extends MusicalInstrument {
    public SnareDrum(String name, double price, String description) {
        super(name, price, description);
    }

    public static List<MusicalInstrument> getSnareDrumModels() {
        List<MusicalInstrument> snareDrums = new ArrayList<>();
        snareDrums.add(new SnareDrum("Ludwig Supraphonic", 300.0, "A legendary snare with a bright sound."));
        snareDrums.add(new SnareDrum("Gretsch Brooklyn Series", 250.0, "A versatile snare drum with warm tones."));
        snareDrums.add(new SnareDrum("Pearl Sensitone", 200.0, "An affordable snare with great quality."));
        snareDrums.add(new SnareDrum("Tama SLP", 280.0, "A unique sound with great projection."));
        return snareDrums;
    }
}

