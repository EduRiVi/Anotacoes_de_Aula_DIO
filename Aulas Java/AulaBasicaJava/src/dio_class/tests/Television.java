package dio_class.tests;

public class Television {
    private int channel;
    private int volume;
    private boolean isOn;

    public Television(int defaultChannel, int defaultVolume, boolean initialState) {
        this.channel = defaultChannel;
        this.volume = defaultVolume;
        this.isOn = initialState;
    }
    
    public void turnOn() {
        isOn = true;
        System.out.println("The television is now ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("The television is now OFF.");
    }
    
    public boolean veryfyStateToControl() {
        if (!isOn) {
            System.out.println("Please turn on the television first.");
            return false;
        }
        return true;
    }

    public void increaseVolume() {
        if (veryfyStateToControl()) {
            System.out.println("Volume increased to " + ++volume);
        }
    }

    public void decreaseVolume() {
        if (veryfyStateToControl()) {
            System.out.println("Volume decreased to " + --volume);
        }
    }

    public void changeChannel(int channel) {
        if (veryfyStateToControl()) {
            this.channel = channel;
            System.out.println("Changing to channel " + this.channel);
        }
    }

    public void nextChannel() {
        changeChannel(channel + 1);
    }

    public void previousChannel() {
        changeChannel(channel - 1);
    }
    
}
