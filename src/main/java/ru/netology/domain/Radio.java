package ru.netology.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Radio {
    private int numberOfRadioStations = 10;
    private int numberCurrentRadioStation;
    private int currentVolume;

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public void setNumberCurrentRadioStation(int numberCurrentRadioStation) {
        int maxNumberRadioStation = numberOfRadioStations - 1;
        if (numberCurrentRadioStation > maxNumberRadioStation) {
            return;
        }
        if (numberCurrentRadioStation < 0) {
            return;
        }
        this.numberCurrentRadioStation = numberCurrentRadioStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextRadioStation() {
        int maxNumberRadioStation = numberOfRadioStations - 1;
        if (numberCurrentRadioStation == maxNumberRadioStation) {
            numberCurrentRadioStation = 0;
        } else {
            numberCurrentRadioStation = numberCurrentRadioStation + 1;
        }
    }

    public void prevRadioStation() {
        int maxNumberRadioStation = numberOfRadioStations - 1;
        if (numberCurrentRadioStation == 0) {
            numberCurrentRadioStation = maxNumberRadioStation;
        } else {
            numberCurrentRadioStation = numberCurrentRadioStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume == 100) {
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
