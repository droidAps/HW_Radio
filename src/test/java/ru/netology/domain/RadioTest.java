package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(25);

    @Test
    public void shouldSetNumberCurrentRadioStationInRange() {
        radio.setNumberCurrentRadioStation(0);
        assertEquals(0, radio.getNumberCurrentRadioStation());

        radio.setNumberCurrentRadioStation(5);
        assertEquals(5, radio.getNumberCurrentRadioStation());

        radio.setNumberCurrentRadioStation(24);
        assertEquals(24, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldSetNumberCurrentRadioStationBeyondRange() {
        radio.setNumberCurrentRadioStation(5);

        radio.setNumberCurrentRadioStation(-1);
        assertEquals(5, radio.getNumberCurrentRadioStation());

        radio.setNumberCurrentRadioStation(25);
        assertEquals(5, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentVolumeInRange() {
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(50);
        assertEquals(50, radio.getCurrentVolume());

        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeBeyondRange() {
        radio.setCurrentVolume(75);

        radio.setCurrentVolume(-3);
        assertEquals(75, radio.getCurrentVolume());

        radio.setCurrentVolume(102);
        assertEquals(75, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextRadioStation() {
        radio.setNumberCurrentRadioStation(5);
        radio.nextRadioStation();
        assertEquals(6, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldNextMaxRadioStation() {
        radio.setNumberCurrentRadioStation(24);
        radio.nextRadioStation();
        assertEquals(0, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStation() {
        radio.setNumberCurrentRadioStation(8);
        radio.prevRadioStation();
        assertEquals(7, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldPrevMinRadioStation() {
        radio.setNumberCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(24, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(75);
        radio.increaseVolume();
        assertEquals(76, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceVolume() {
        radio.setCurrentVolume(100);
        radio.reduceVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceMinVolume() {
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}