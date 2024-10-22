package org.example.drums;

import org.example.MusicalInstrument;

import java.util.ArrayList;
import java.util.List;

public class DrumSet extends MusicalInstrument {
    public DrumSet(String name, double price, String description) {
        super(name, price, description);
    }

    public static List<MusicalInstrument> getDrumSetModels() {
        List<MusicalInstrument> drumSets = new ArrayList<>();
        drumSets.add(new DrumSet("Yamaha Stage Custom", 700.0, "A versatile drum set for all styles."));
        drumSets.add(new DrumSet("Ludwig Classic Maple", 1200.0, "A classic drum set known for its sound quality."));
        drumSets.add(new DrumSet("Pearl Export", 800.0, "A popular choice for beginners and intermediate players."));
        drumSets.add(new DrumSet("DW Collector's Series", 2500.0, "A premium drum set for professional musicians."));
        return drumSets;
    }
}

