package org.example.guitars;

import org.example.MusicalInstrument;

import java.util.ArrayList;
import java.util.List;

public class Guitar extends MusicalInstrument {
    public Guitar(String name, double price, String description) {
        super(name, price, description);
    }

    public static List<MusicalInstrument> getGuitarModels() {
        List<MusicalInstrument> guitars = new ArrayList<>();
        guitars.add(new Guitar("Fender Stratocaster", 1200.0, "Iconic electric guitar known for its bright, cutting tone."));
        guitars.add(new Guitar("Gibson Les Paul", 2500.0, "Classic rock guitar with thick, powerful sound."));
        guitars.add(new Guitar("Ibanez RG", 1500.0, "Popular among metal players for its fast neck and aggressive tone."));
        guitars.add(new Guitar("Yamaha Pacifica", 600.0, "Affordable guitar with versatile sound for beginners."));
        guitars.add(new Guitar("Epiphone SG", 450.0, "A budget version of the famous Gibson SG, ideal for rock."));
        guitars.add(new Guitar("Jackson Dinky", 1300.0, "High-performance guitar with a focus on speed and playability."));
        guitars.add(new Guitar("PRS Custom 24", 3500.0, "Luxury guitar with a rich, full tone and beautiful craftsmanship."));
        guitars.add(new Guitar("Schecter C-1", 900.0, "A solid choice for modern rock and metal players."));
        guitars.add(new Guitar("ESP LTD", 1700.0, "Heavy-duty guitar built for high-gain tones."));
        guitars.add(new Guitar("Charvel Pro-Mod", 1200.0, "Designed for shredding, with a fast neck and versatile pickups."));
        return guitars;
    }
}




