package org.example.drums;

import org.example.MusicalInstrument;

import java.util.ArrayList;
import java.util.List;

public class Drums extends MusicalInstrument {
    public Drums(String name, double price, String description) {
        super(name, price, description);
    }

    public static List<MusicalInstrument> getDrumModels() {
        List<MusicalInstrument> drums = new ArrayList<>();
        drums.add(new Drums("Pearl Export", 1500.0, "One of the most popular drum kits for beginners and intermediate players."));
        drums.add(new Drums("Tama Imperialstar", 1000.0, "Affordable drum kit with great sound and durability."));
        drums.add(new Drums("DW Collector's Series", 3500.0, "High-end drum set with premium construction and tone."));
        drums.add(new Drums("Yamaha Stage Custom", 1200.0, "Versatile drum kit used by professionals around the world."));
        drums.add(new Drums("Mapex Saturn V", 2000.0, "Powerful drum kit with excellent projection and tonal control."));
        drums.add(new Drums("Ludwig Classic Maple", 3000.0, "Vintage-inspired drum kit with a classic sound."));
        drums.add(new Drums("Gretsch Renown", 1800.0, "Well-balanced kit with a bright, focused sound."));
        drums.add(new Drums("Sonor SQ2", 4000.0, "Premium custom drum kit with endless tonal options."));
        drums.add(new Drums("Roland V-Drums TD-50KV", 7000.0, "Top-tier electronic drum kit with advanced features."));
        drums.add(new Drums("Alesis Strike Pro", 2500.0, "Electronic drum kit with a natural feel and responsive pads."));
        return drums;
    }
}


