package dio.tests;
public class User {
    public static void main(String[] args) {
        Television tv = new Television(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Boolean.parseBoolean(args[2]));
        
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