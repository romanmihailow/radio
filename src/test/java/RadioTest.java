import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    //flexible on

    @Test
    public void shouldIncreaseVolume() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(0);
        radioVolume.setIncreaseVolume();
        int expected = 1;
        int actual = radioVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);          //   увеличение звука на 1 работает
    }

    @Test
    public void shouldIncreaseVolume100() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(100);
        radioVolume.setIncreaseVolume();
        int expected = 100;
        int actual = radioVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);      //   больше максимальной громкости 100 звук прибавить нельзя
    }
    @Test
    public void shouldDecreaseVolume0() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(0);
        radioVolume.setDecreaseVolume();
        int expected = 0;
        int actual = radioVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);       // ниже 0 звук убавить нельзя))))))))
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(100);
        radioVolume.setDecreaseVolume();
        int expected = 99;
        int actual = radioVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);    //   убавить звук на 1 работает
    }



    @Test
    public void shouldSwitchNextChannel0() {
        Radio radioChannel = new Radio();
        radioChannel.next();
        int expected = 1;
        int actual = radioChannel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchNextChannel() {
        Radio radioChannel = new Radio();
        radioChannel.setCurrentChannel(9);
        radioChannel.next();
        int expected = 0;
        int actual = radioChannel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchPrevChannel9() {
        Radio radioChannel = new Radio();
        radioChannel.setCurrentChannel(9);
        radioChannel.prev();
        int expected = 8;
        int actual = radioChannel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSwitchPrevChannel() {
        Radio radioChannel = new Radio();
        radioChannel.prev();
        int expected = 9;
        int actual = radioChannel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSwitchChannelMore9() {
        Radio radioChannel = new Radio();
        radioChannel.setCurrentChannel(10);
        radioChannel.prev();
        int expected = 9;
        int actual = radioChannel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSwitchChannelLessThan0() {
        Radio radioChannel = new Radio();
        radioChannel.setCurrentChannel(-1);
        radioChannel.prev();
        int expected = 9;
        int actual = radioChannel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);

    }



}