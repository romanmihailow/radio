import com.sun.nio.sctp.Association;

public class Radio {

    private int currentVolume=5;
    private int currentChannel;
    private int minNumberChannel = 0;
    private int countChannel = 10;
    private int maxNumberChannel = countChannel - 1;

    public Radio(int countChannel, int setCurrentVolume) {

        if (setCurrentVolume < 0 ) {
            return;
        }
        if ( setCurrentVolume > countChannel - 1 ) {
            return;
        }
        currentVolume = setCurrentVolume;
    }

//    public Radio (int setIncreaseVolume) {
//        if (setIncreaseVolume < 100) {
//            currentVolume = currentVolume + 1;
//        } else {
//            currentVolume = 100;
//        }
//
//    }

    public Radio(int setIncreaseVolume) {
        if (setIncreaseVolume < 100) {
            currentVolume = setIncreaseVolume + 1;
        } else {
            currentVolume = 100;
        }
    }


    public int getCountChannel() {
        return countChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

//    public void setCurrentVolume(int newCurrentVolume) {
//        if (newCurrentVolume < 0 ) {
//            return;
//        }
//        if (newCurrentVolume > 100 ) {
//            return;
//        }
//
//        currentVolume = newCurrentVolume;
//
//    }
    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel < 0 ) {
            return;
        }
        if (newCurrentChannel > 9 ) {
            return;
        }

        currentChannel = newCurrentChannel;

    }



//    public void setIncreaseVolume() {
//
//        if (currentVolume < 100) {
//            currentVolume = currentVolume + 1;
//        } else {
//            currentVolume = 100;
//        }
//    }



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
