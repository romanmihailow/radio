import com.sun.nio.sctp.Association;

public class Radio {

    private int currentVolume;
    private int currentChannel;
    private int minNumberChannel;
    private int countChannel = 10;
    private int maxNumberChannel = countChannel - 1;

    public Radio() {

    }

    public Radio(int countChannel) {
        this.countChannel = countChannel;
        maxNumberChannel = countChannel - 1;
        //this.minNumberChannel = 0;
    }


    public int getMaxNumberChannel() {
        maxNumberChannel = countChannel - 1;
        return maxNumberChannel;
    }

    public int getCountChannel() {
        return countChannel;
    }

    public void setCountChannel(int newCountChannel) {
        if (newCountChannel < minNumberChannel) {
            return;
        } else {
            countChannel = newCountChannel;
            maxNumberChannel = countChannel - 1;
        }

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    //public void setCountChannel() { return countChannel; }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }

        currentVolume = newCurrentVolume;

    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel < minNumberChannel) {
            return;
        }
        if (newCurrentChannel > maxNumberChannel) {
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
        if (currentChannel < maxNumberChannel) {
            currentChannel = currentChannel + 1;
        } else {
            currentChannel = 0;
        }
    }

    public void prev() {
        if (currentChannel > 0) {
            currentChannel = currentChannel - 1;
        } else {
            currentChannel = maxNumberChannel;
        }
    }

}
