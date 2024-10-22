package org.example.keyboard;

import org.example.MusicalInstrument;

import java.util.ArrayList;
import java.util.List;

public class Accordion extends MusicalInstrument {
    public Accordion(String name, double price, String description) {
        super(name, price, description);
    }

    public static List<MusicalInstrument> getAccordionModels() {
        List<MusicalInstrument> accordions = new ArrayList<>();
        accordions.add(new Accordion("Piano Accordion", 1000.0, "A versatile accordion with piano keys."));
        accordions.add(new Accordion("Diatonic Accordion", 800.0, "Commonly used in folk music."));
        accordions.add(new Accordion("Button Accordion", 1200.0, "Features buttons instead of piano keys."));
        accordions.add(new Accordion("Cajun Accordion", 1500.0, "A small accordion used in Cajun music."));
        return accordions;
    }
}

