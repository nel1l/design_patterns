interface Device {
    void powerOn();
    void powerOff();
    void setChannel(int channel);
    void setVolume(int volume);
}

class TvDevice implements Device {
    @Override
    public void powerOn() {
        System.out.println("TV is powered on");
    }
    @Override
    public void powerOff() {
        System.out.println("TV is powered off");
    }
    @Override
    public void setChannel(int channel) {
        System.out.println("TV chanel set to " + channel);
    }
    @Override
    public void setVolume(int volume) {
        System.out.println("TV volume set to " + volume);
    }
}

class DVDDevice implements Device {
    @Override
    public void powerOn() {
        System.out.println("DVD is powered on");
    }
    @Override
    public void powerOff() {
        System.out.println("DVD is powered off");
    }
    @Override
    public void setChannel(int channel) {
        System.out.println("DVD chanel set to " + channel);
    }
    @Override
    public void setVolume(int volume) {
        System.out.println("DVD volume set to " + volume);
    }
}

class SoundSystemDevice implements Device {
    @Override
    public void powerOn() {
        System.out.println("Sound System is powered on");
    }
    @Override
    public void powerOff() {
        System.out.println("Sound System is powered off");
    }
    @Override
    public void setChannel(int channel) {
        System.out.println("Sound System chanel set to " + channel);
    }
    @Override
    public void setVolume(int volume) {
        System.out.println("Sound System volume set to " + volume);
    }
}

abstract class RemoteControl {
    protected Device device;
    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void power();
    public abstract void setChannel(int channel);
    public abstract void setVolume(int volume);
}

class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void power() {
        System.out.println("BasicRemote: poweron/poweroff button pressed");
        device.powerOn();
        device.powerOff();
    }
    @Override
    public void setChannel(int channel) {
        System.out.println("Basic remote: setting channel to " + channel);
        device.setChannel(channel);
    }
    @Override
    public void setVolume(int volume) {
        System.out.println("Basic remote: setting volume to " + volume);
        device.setVolume(volume);
    }
}

class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void power() {
        System.out.println("AdvancedRemote: poweron/poweroff button pressed");
        device.powerOn();
        device.powerOff();
    }
    @Override
    public void setChannel(int channel) {
        System.out.println("AdvancedRemote: setting channel to " + channel);
        device.setChannel(channel);
    }
    @Override
    public void setVolume(int volume) {
        System.out.println("AdvancedRemote: setting volume to " + volume);
        device.setVolume(volume);
    }
}