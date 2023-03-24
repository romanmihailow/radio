import com.sun.nio.sctp.Association;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    //flexible on

    @Test
    public void test() {
        Radio radioChannel = new Radio(10);
        Assertions.assertEquals(10, radioChannel.getCountChannel());

    }

    @Test
    public void souldSetCountChennel() {
        Radio radioChannel = new Radio(10);
        radioChannel.setCountChannel(10);
        Assertions.assertEquals(10, radioChannel.getCountChannel());

    }

    @Test
    public void shouldMaxNumberChannel() {
        Radio radioChannel = new Radio(10);
        //radioChannel.setCountChannel(100);
        Assertions.assertEquals(9, radioChannel.getMaxNumberChannel());

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radioVolume = new Radio(10);
        radioVolume.setCurrentVolume(0);
        radioVolume.setIncreaseVolume();
        int expected = 1;
        int actual = radioVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);          //   увеличение звука на 1 работает
    }

    @Test
    public void shouldIncreaseVolume100() {
        Radio radioVolume = new Radio(10);
        radioVolume.setCurrentVolume(100);
        radioVolume.setIncreaseVolume();
        int expected = 100;
        int actual = radioVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);      //   больше максимальной громкости 100 звук прибавить нельзя
    }
    @Test
    public void shouldDecreaseVolume0() {
        Radio radioVolume = new Radio(10);
        radioVolume.setCurrentVolume(0);
        radioVolume.setDecreaseVolume();
        int expected = 0;
        int actual = radioVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);       // ниже 0 звук убавить нельзя))))))))
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radioVolume = new Radio(10);
        radioVolume.setCurrentVolume(100);
        radioVolume.setDecreaseVolume();
        int expected = 99;
        int actual = radioVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);    //   убавить звук на 1 работает
    }











    @Test
    public void shouldSwitchPrevChannel() {
        Radio radioChannel = new Radio(10);     //проверка переключения канала назад (текущий канал 0)
        radioChannel.setCurrentChannel(5);
        radioChannel.prev();                                //-1
        int expected = 4;                                   //4
        int actual = radioChannel.getCurrentChannel();      //4
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSwitchNextChannel() {
        Radio radioChannel = new Radio(10);     //проверка переключения канала вперед (текущий канал 0)
        radioChannel.setCurrentChannel(5);
        radioChannel.next();                                //+1
        int expected = 6;                                   //6
        int actual = radioChannel.getCurrentChannel();      //6
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetChannel() {
        Radio radioChannel = new Radio(10);     //проверка установки канала
        radioChannel.setCurrentChannel(5);

        int expected = 5;                                   //5
        int actual = radioChannel.getCurrentChannel();      //5
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetChannelMoreMaxNumberChannel() {
        Radio radioChannel = new Radio(10);           //проверка установки номера канала более максимального количества каналов
        radioChannel.setCurrentChannel(101);                      //101

        int expected = 0;                                         //0
        int actual = radioChannel.getCurrentChannel();            //0
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetChannelLessMinNumberChannel() {
        Radio radioChannel = new Radio(10);           //проверка установки номера канала менее минимального количества каналов
        radioChannel.setCurrentChannel(-1);                      //101

        int expected = 0;                                         //0
        int actual = radioChannel.getCurrentChannel();            //0
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchChannelLessMinNumberChannel() {
        Radio radioChannel = new Radio(10);           //проверка переключения номера канала менее минимального количества каналов
        radioChannel.setCurrentChannel(0);                        //0
        radioChannel.prev();
        int expected = radioChannel.getMaxNumberChannel();        //max
        int actual = radioChannel.getCurrentChannel();            //max
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchChannelMoreMaxNumberChannel() {
        Radio radioChannel = new Radio(10);           //проверка переключения номера канала более максимального количества каналов
        radioChannel.setCurrentChannel(9);                        //9
        radioChannel.next();
        int expected = 0;                                         //0
        int actual = radioChannel.getCurrentChannel();            //0
        Assertions.assertEquals(expected, actual);
    }





}