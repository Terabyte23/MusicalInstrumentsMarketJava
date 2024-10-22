package org.example;

import org.example.drums.Drums;
import org.example.guitars.Guitar;
import org.example.keyboard.KeyboardInstruments;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MusicStoreTest {

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void testShowKeyboardModels_KeyboardInstruments() {
        assertEquals(10, KeyboardInstruments.getPianoModels().size());
    }

    @Test
    public void testShowGuitarModels_Guitar() {
        assertEquals(10, Guitar.getGuitarModels().size());
    }

    @Test
    public void testShowDrumModels_Drums() {
        assertEquals(10, Drums.getDrumModels().size());
    }
}

