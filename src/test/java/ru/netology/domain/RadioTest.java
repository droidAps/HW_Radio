package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetNumberCurrentRadioStationInRange() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadioStation(0);
        assertEquals(0, radio.getNumberCurrentRadioStation());

        radio.setNumberCurrentRadioStation(5);
        assertEquals(5, radio.getNumberCurrentRadioStation());

        radio.setNumberCurrentRadioStation(9);
        assertEquals(9, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldSetNumberCurrentRadioStationBeyondRange() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadioStation(5);

        radio.setNumberCurrentRadioStation(-1);
        assertEquals(5, radio.getNumberCurrentRadioStation());

        radio.setNumberCurrentRadioStation(10);
        assertEquals(5, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentVolumeInRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());

        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeBeyondRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        radio.setCurrentVolume(-3);
        assertEquals(7, radio.getCurrentVolume());

        radio.setCurrentVolume(12);
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextRadioStation() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadioStation(5);
        radio.nextRadioStation();
        assertEquals(6, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldNextMaxRadioStation() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadioStation(9);
        radio.nextRadioStation();
        assertEquals(0, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadioStation(8);
        radio.prevRadioStation();
        assertEquals(7, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldPrevMinRadioStation() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(9, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.reduceVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}