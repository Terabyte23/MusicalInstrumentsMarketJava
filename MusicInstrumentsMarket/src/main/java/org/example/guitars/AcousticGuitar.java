package org.example.guitars;

import org.example.MusicalInstrument;

import java.util.ArrayList;
import java.util.List;

public class AcousticGuitar extends MusicalInstrument {
    public AcousticGuitar(String name, double price, String description) {
        super(name, price, description);
    }

    public static List<MusicalInstrument> getAcousticGuitarModels() {
        List<MusicalInstrument> acousticGuitars = new ArrayList<>();
        acousticGuitars.add(new AcousticGuitar("Martin D-28", 3000.0, "High-end acoustic guitar with a rich sound."));
        acousticGuitars.add(new AcousticGuitar("Taylor 314", 2000.0, "Versatile acoustic guitar known for its playability."));
        acousticGuitars.add(new AcousticGuitar("Yamaha F310", 300.0, "Affordable and great for beginners."));
        acousticGuitars.add(new AcousticGuitar("Gibson J-45", 3500.0, "Classic acoustic guitar with a warm tone."));
        return acousticGuitars;
    }
}

