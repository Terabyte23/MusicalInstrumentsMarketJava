package org.example.guitars;

import org.example.MusicalInstrument;

import java.util.ArrayList;
import java.util.List;

public class BassGuitar extends MusicalInstrument {
    public BassGuitar(String name, double price, String description) {
        super(name, price, description);
    }

    public static List<MusicalInstrument> getBassGuitarModels() {
        List<MusicalInstrument> bassGuitars = new ArrayList<>();
        bassGuitars.add(new BassGuitar("Fender Precision Bass", 1200.0, "Classic bass guitar known for its solid tone."));
        bassGuitars.add(new BassGuitar("Gibson Thunderbird", 2500.0, "Stylish bass with a powerful sound."));
        bassGuitars.add(new BassGuitar("Ibanez SR300E", 500.0, "Affordable and versatile bass guitar for beginners."));
        bassGuitars.add(new BassGuitar("Yamaha TRBX304", 700.0, "Great value for a versatile and quality bass guitar."));
        return bassGuitars;
    }
}

