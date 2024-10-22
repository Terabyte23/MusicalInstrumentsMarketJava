package org.example.guitars;

import org.example.MusicalInstrument;

import java.util.ArrayList;
import java.util.List;

public class ClassicalGuitar extends MusicalInstrument {
    public ClassicalGuitar(String name, double price, String description) {
        super(name, price, description);
    }

    public static List<MusicalInstrument> getClassicalGuitarModels() {
        List<MusicalInstrument> classicalGuitars = new ArrayList<>();
        classicalGuitars.add(new ClassicalGuitar("Yamaha C40", 200.0, "Great beginner classical guitar."));
        classicalGuitars.add(new ClassicalGuitar("Cordoba C5", 400.0, "Solid top and excellent sound quality."));
        classicalGuitars.add(new ClassicalGuitar("Alhambra 3C", 700.0, "Professional level guitar with a rich tone."));
        classicalGuitars.add(new ClassicalGuitar("Ramirez 1A", 3000.0, "High-quality classical guitar made in Spain."));
        return classicalGuitars;
    }
}

