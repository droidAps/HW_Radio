package ru.netology.domain;

public class Radio {
    private int numberCurrentRadioStation;
    private int currentVolume;

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int numberCurrentRadioStation) {
        if (numberCurrentRadioStation > 9) {
            return;
        }
        if (numberCurrentRadioStation < 0) {
            return;
        }
        this.numberCurrentRadioStation = numberCurrentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextRadioStation() {
        if (numberCurrentRadioStation == 9) {
            numberCurrentRadioStation = 0;
        } else {
            numberCurrentRadioStation = numberCurrentRadioStation + 1;
        }
    }

    public void prevRadioStation() {
        if (numberCurrentRadioStation == 0) {
            numberCurrentRadioStation = 9;
        } else {
            numberCurrentRadioStation = numberCurrentRadioStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume == 10) {
            return;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume == 0) {
            return;
        } else {
            currentVolume = currentVolume - 1;
        }
    }

}
