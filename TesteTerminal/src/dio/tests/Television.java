package dio.tests;
/**
 * <h1>Television</h1>
 * The Television class simulates a simple television with functionalities to turn it on/off, change channels, and adjust volume.
 * <p>
 * <b>Note:</b> This class is a simple simulation and does represent a real television.
 * @autor Eduardo Ribeiro
 * @version 1.0
 * @since 2025-05-18
 */

class Television {
    private int channel;
    private int volume;
    private boolean isOn;

    /**
     * <h2>Constructor</h2>
     * <p>This constructor initializes the television with a default channel, volume, and state.
     * @param defaultChannel The initial channel of the television.
     * @param defaultVolume The initial volume of the television.
     * @param initialState The initial state of the television (ON/OFF).
     */
    public Television(int defaultChannel, int defaultVolume, boolean initialState) {
        this.channel = defaultChannel;
        this.volume = defaultVolume;
        this.isOn = initialState;
    }

    /**
     * <h2>Turn on the television</h2>
     * <p>This method sets the television state to ON and prints a message indicating the action.
     * <p>
     * <b>Note:</b> For set the state to OFF, use the {@link #turnOff()} method.
     */
    public void turnOn() {
        isOn = true;
        System.out.println("The television is now ON.");
    }

    /**
     * <h2>Turn off the television</h2>
     * <p>This method sets the television state to OFF and prints a message indicating the action.
     * <p>
     * <b>Note:</b> For set the state to ON, use the {@link #turnOn()} method.
     */
    public void turnOff() {
        isOn = false;
        System.out.println("The television is now OFF.");
    }
    
    /**
     * <h2>Verify state to control</h2>
     * <p>This method checks if the television is ON before allowing any control actions.
     * @return true if the television is ON, false otherwise.
     * @see #turnOn()
     */
    public boolean veryfyStateToControl() {
        if (!isOn) {
            System.out.println("Please turn on the television first.");
            return false;
        }
        return true;
    }

    /**
     * <h2>Increase volume</h2>
     * <p>This method increases the volume of the television by 1 unit.
     * <p>
     * <b>Note:</b> The volume can only be increased if the television is ON. 
     * For decrease the volume, use the {@link #decreaseVolume()} method.
     * @see #turnOn()
     */
    public void increaseVolume() {
        if (veryfyStateToControl()) {
            System.out.println("Volume increased to " + ++volume);
        }
    }

    /**
     * <h2>Decrease volume</h2>
     * <p>This method decreases the volume of the television by 1 unit.
     * <p>
     * <b>Note:</b> The volume can only be decreased if the television is ON. 
     * For increase the volume, use the {@link #increaseVolume()} method.
     * @see #turnOn()
     */
    public void decreaseVolume() {
        if (veryfyStateToControl()) {
            System.out.println("Volume decreased to " + --volume);
        }
    }

    /**
     * <h2>Change channel</h2>
     * <p>This method changes the channel of the television to the specified channel.
     * <p><b>Note:</b> 
     * The channel can only be changed if the television is ON. 
     * For navigate between channels, use the {@link #nextChannel()} and {@link #previousChannel()} methods.
     * @param channel The new channel to set.
     * @see #turnOn()
     */
    public void changeChannel(int channel) {
        if (veryfyStateToControl()) {
            this.channel = channel;
            System.out.println("Changing to channel " + this.channel);
        }
    }

    /**
     * <h2>Next channel</h2>
     * <p>This method changes the television to the next channel.
     * <p>
     * <b>Note:</b> The channel can only be changed if the television is ON. 
     * For change the channel, use the {@link #changeChannel(int)} method.
     * @see #turnOn()
     * @see #previousChannel()
     * 
     */
    public void nextChannel() {
        channel++;
    }

    /**
     * <h2>Previous channel</h2>
     * <p>This method changes the television to the previous channel.
     * <p>
     * <b>Note:</b> The channel can only be changed if the television is ON. 
     * For change the channel, use the {@link #changeChannel(int)} method.
     * @see #turnOn()
     * @see #nextChannel()
     */
    public void previousChannel() {
        channel--;
    }

    /**
     * <h2>Show status</h2>
     * <p>This method prints the current status of the television, including its state, channel, and volume.
     */
    public void showStatus() {
        System.out.println("Television is " + (isOn ? "ON" : "OFF"));
        System.out.println("Current channel: " + channel);
        System.out.println("Current volume: " + volume);
    }
    
}

