package org.example.keyboard;

import org.example.MusicalInstrument;

import java.util.ArrayList;
import java.util.List;

public class KeyboardInstruments extends MusicalInstrument {
    public KeyboardInstruments(String name, double price, String description) {
        super(name, price, description);
    }

    public static List<MusicalInstrument> getPianoModels() {
        List<MusicalInstrument> pianos = new ArrayList<>();
        pianos.add(new KeyboardInstruments("Yamaha U3", 8000.0, "Professional upright piano with a warm and balanced sound."));
        pianos.add(new KeyboardInstruments("Steinway & Sons Model D", 150000.0, "World-renowned grand piano, known for its rich tone."));
        pianos.add(new KeyboardInstruments("Kawai K300", 7000.0, "Reliable and versatile upright piano for all levels."));
        pianos.add(new KeyboardInstruments("Baldwin BP190", 12000.0, "Classic grand piano with a bold, resonant tone."));
        pianos.add(new KeyboardInstruments("Casio PX-870", 1100.0, "Digital piano with an authentic feel and sound at an affordable price."));
        pianos.add(new KeyboardInstruments("Roland FP-30X", 950.0, "Compact digital piano with excellent sound quality."));
        pianos.add(new KeyboardInstruments("Korg LP-380", 1200.0, "Stylish digital piano with a responsive keyboard and rich sound."));
        pianos.add(new KeyboardInstruments("Nord Piano 5", 2500.0, "High-end stage piano favored by professionals."));
        pianos.add(new KeyboardInstruments("Fazioli F308", 200000.0, "Luxurious grand piano with unparalleled craftsmanship."));
        pianos.add(new KeyboardInstruments("Bluthner Model 1", 135000.0, "Premium grand piano known for its silky tone."));
        return pianos;
    }
}




