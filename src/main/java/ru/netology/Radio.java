package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0 | newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == 9) {
            setCurrentStation(0);
        }
        else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prev() {
        if (currentStation == 0) {
            setCurrentStation(9);
        }
        else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void increaseVolume(){
        if (currentVolume <10){
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume(){
        if (currentVolume > 0){
            currentVolume = currentVolume - 1;
        }
    }


}
