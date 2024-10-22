package org.example;

import org.example.drums.Cajon;
import org.example.drums.DrumSet;
import org.example.drums.SnareDrum;
import org.example.guitars.AcousticGuitar;
import org.example.guitars.BassGuitar;
import org.example.guitars.ClassicalGuitar;
import org.example.guitars.ElectricGuitar;
import org.example.keyboard.Accordion;
import org.example.keyboard.Organ;
import org.example.keyboard.Piano;
import org.example.keyboard.Synthesizer;

import java.util.List;

public class MusicStore {
    public void showInstrumentCategories() {
        System.out.println("Available categories:");
        System.out.println("1. Guitars");
        System.out.println("2. Keyboards");
        System.out.println("3. Drums");
    }

    public void showGuitarTypes() {
        System.out.println("Choose a type of guitar:");
        System.out.println("1. Bass Guitar");
        System.out.println("2. Acoustic Guitar");
        System.out.println("3. Classical Guitar");
        System.out.println("4. Electric Guitar");
    }


    public void showGuitarModels(String guitarType) {
        List<MusicalInstrument> models = null;

        switch (guitarType.toLowerCase()) {
            case "bass":
                models = BassGuitar.getBassGuitarModels();
                break;
            case "acoustic":
                models = AcousticGuitar.getAcousticGuitarModels();
                break;
            case "classical":
                models = ClassicalGuitar.getClassicalGuitarModels();
                break;
            case "electric":
                models = ElectricGuitar.getElectricGuitarModels();
                break;
            default:
                System.out.println("Invalid guitar type.");
                return;
        }

        if (models != null) {
            System.out.println("Available " + guitarType + " models:");
            for (int i = 0; i < models.size(); i++) {
                System.out.println((i + 1) + ". " + models.get(i).getName() + " ($" + models.get(i).getPrice() + ")");
            }
        }
    }

    public void showKeyboardTypes() {
        System.out.println("Choose a type of keyboard instrument:");
        System.out.println("1. Piano");
        System.out.println("2. Organ");
        System.out.println("3. Synthesizer");
        System.out.println("4. Accordion");
    }

    public void showKeyboardModels(String keyboardType) {
        List<MusicalInstrument> models = null;

        switch (keyboardType.toLowerCase()) {
            case "piano":
                models = Piano.getPianoModels();
                break;
            case "organ":
                models = Organ.getOrganModels();
                break;
            case "synthesizer":
                models = Synthesizer.getSynthesizerModels();
                break;
            case "accordion":
                models = Accordion.getAccordionModels();
                break;
            default:
                System.out.println("Invalid keyboard type.");
                return;
        }

        if (models != null) {
            System.out.println("Available " + keyboardType + " models:");
            for (int i = 0; i < models.size(); i++) {
                System.out.println((i + 1) + ". " + models.get(i).getName() + " ($" + models.get(i).getPrice() + ")");
            }
        }
    }

    public void showDrumTypes() {
        System.out.println("Choose a type of drum:");
        System.out.println("1. Drum Set");
        System.out.println("2. Snare Drum");
        System.out.println("3. Cajon");
    }

    public void showDrumModels(String drumType) {
        List<MusicalInstrument> models = null;

        switch (drumType.toLowerCase()) {
            case "drum set":
                models = DrumSet.getDrumSetModels();
                break;
            case "snare drum":
                models = SnareDrum.getSnareDrumModels();
                break;
            case "cajon":
                models = Cajon.getCajonModels();
                break;
            default:
                System.out.println("Invalid drum type.");
                return;
        }

        if (models != null) {
            System.out.println("Available " + drumType + " models:");
            for (int i = 0; i < models.size(); i++) {
                System.out.println((i + 1) + ". " + models.get(i).getName() + " ($" + models.get(i).getPrice() + ")");
            }
        }
    }

    public void showModelDescription(String instrumentType, String type, int modelIndex) {
        List<MusicalInstrument> models = null;

        switch (instrumentType.toLowerCase()) {
            case "guitar":
                switch (type.toLowerCase()) {
                    case "bass":
                        models = BassGuitar.getBassGuitarModels();
                        break;
                    case "acoustic":
                        models = AcousticGuitar.getAcousticGuitarModels();
                        break;
                    case "classical":
                        models = ClassicalGuitar.getClassicalGuitarModels();
                        break;
                    case "electric":
                        models = ElectricGuitar.getElectricGuitarModels();
                        break;
                    default:
                        System.out.println("Invalid guitar type.");
                        return;
                }
                break;

            case "keyboard":
                switch (type.toLowerCase()) {
                    case "piano":
                        models = Piano.getPianoModels();
                        break;
                    case "organ":
                        models = Organ.getOrganModels();
                        break;
                    case "synthesizer":
                        models = Synthesizer.getSynthesizerModels();
                        break;
                    case "accordion":
                        models = Accordion.getAccordionModels();
                        break;
                    default:
                        System.out.println("Invalid keyboard type.");
                        return;
                }
                break;

            case "drum":
                switch (type.toLowerCase()) {
                    case "drum set":
                        models = DrumSet.getDrumSetModels();
                        break;
                    case "snare drum":
                        models = SnareDrum.getSnareDrumModels();
                        break;
                    case "cajon":
                        models = Cajon.getCajonModels();
                        break;
                    default:
                        System.out.println("Invalid drum type.");
                        return;
                }
                break;

            default:
                System.out.println("Invalid instrument type.");
                return;
        }

        if (models != null && modelIndex >= 0 && modelIndex < models.size()) {
            MusicalInstrument model = models.get(modelIndex);
            System.out.println("Model: " + model.getName());
            System.out.println("Price: $" + model.getPrice());
            System.out.println("Description: " + model.getDescription());
        } else {
            System.out.println("Invalid model selection.");
        }
    }
}










