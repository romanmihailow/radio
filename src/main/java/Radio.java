public class Radio {

    public int currentVolume;

    public int currentChannel;

    public void setIncreaseVolume() {

        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }



    public void setDecreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }


    public void next() {
        if (currentChannel < 9) {
            currentChannel = currentChannel + 1;
        } else {
            currentChannel = 0;
        }
    }

    public void prev() {
        if (currentChannel > 0) {
            currentChannel = currentChannel - 1;
        } else {
            currentChannel = 9;
        }
    }

}



