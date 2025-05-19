public class User {
    public static void main(String[] args) {
        Television tv = new Television(5, 10, false);
        
        tv.turnOn();
        tv.increaseVolume();
        tv.changeChannel(7);
        tv.nextChannel();
        tv.previousChannel();
        tv.decreaseVolume();
        tv.turnOff();

        tv.showStatus();
    }
}