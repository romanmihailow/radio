public class Radio {

    private int currentVolume;
    private int currentChannel;
    //private int minNumberChannel = 0;
    //private int countChannel = 10;

    //public Radio() {

    //}

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0 ) {
            return;
        }
        if (newCurrentVolume > 100 ) {
            return;
        }

        currentVolume = newCurrentVolume;

    }
    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel < 0 ) {
            return;
        }
        if (newCurrentChannel > 9 ) {
            return;
        }

        currentChannel = newCurrentChannel;

    }



    public void setIncreaseVolume() {

        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
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
