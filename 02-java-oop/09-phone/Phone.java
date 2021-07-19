package Phone;

public abstract class Phone {
    protected String versionNumber;
    protected int batteryPercentage;
    protected String carrier;
    protected String ringtone;

    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringtone) {
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringtone = ringtone;
    }

    public abstract void displayInfo();

    public String getRingTone() {
        return this.ringtone;
    }
    
    public int getBatteryPercentage() {
        return this.batteryPercentage;
    }
    
    public String getCarrier() {
        return this.carrier;
    }
    
    public String getVersionNumber() {
        return this.versionNumber;
    }
    
}
