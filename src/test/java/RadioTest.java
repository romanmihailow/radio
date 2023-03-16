import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio radioVolume = new Radio();
        radioVolume.setIncreaseVolume();
        int expected = 1;
        int actual = radioVolume.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume10() {
        Radio radioVolume = new Radio();
        radioVolume.currentVolume = 10;
        radioVolume.setIncreaseVolume();
        int expected = 10;
        int actual = radioVolume.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolume0() {
        Radio radioVolume = new Radio();
        radioVolume.setDecreaseVolume();
        int expected = 0;
        int actual = radioVolume.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radioVolume = new Radio();
        radioVolume.currentVolume = 10;
        radioVolume.setDecreaseVolume();
        int expected = 9;
        int actual = radioVolume.currentVolume;
        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void shouldSwitchNextChannel0() {
        Radio radioChannel = new Radio();
        radioChannel.next();
        int expected = 1;
        int actual = radioChannel.currentChannel;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchNextChannel() {
        Radio radioChannel = new Radio();
        radioChannel.currentChannel = 9;
        radioChannel.next();
        int expected = 0;
        int actual = radioChannel.currentChannel;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchPrevChannel9() {
        Radio radioChannel = new Radio();
        radioChannel.currentChannel = 9;
        radioChannel.prev();
        int expected = 8;
        int actual = radioChannel.currentChannel;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSwitchPrevChannel() {
        Radio radioChannel = new Radio();
        radioChannel.prev();
        int expected = 9;
        int actual = radioChannel.currentChannel;
        Assertions.assertEquals(expected, actual);

    }





}

