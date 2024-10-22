package org.example.keyboard;

import org.example.MusicalInstrument;

import java.util.ArrayList;
import java.util.List;

public class Synthesizer extends MusicalInstrument {
    public Synthesizer(String name, double price, String description) {
        super(name, price, description);
    }

    public static List<MusicalInstrument> getSynthesizerModels() {
        List<MusicalInstrument> synthesizers = new ArrayList<>();
        synthesizers.add(new Synthesizer("Korg Minilogue", 500.0, "A polyphonic analog synthesizer with rich sounds."));
        synthesizers.add(new Synthesizer("Roland Juno-106", 1200.0, "Classic synthesizer with a warm sound."));
        synthesizers.add(new Synthesizer("Yamaha Montage", 3500.0, "Powerful synthesizer with advanced features."));
        synthesizers.add(new Synthesizer("Moog Sub 37", 1500.0, "Famous for its fat sound and intuitive controls."));
        return synthesizers;
    }
}

