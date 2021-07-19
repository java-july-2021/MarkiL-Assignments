package Phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringtone) {
        super(versionNumber, batteryPercentage, carrier, ringtone);
    }

    @Override
    public String ring() {
        return this.getRingTone();
    }

    @Override
    public String unlock() {
        return "Unlocked with facial recognition";
    }

    @Override
    public void displayInfo() {
        System.out.println("Version Number: " + this.getVersionNumber());
        System.out.println("Batter Percentage: " + this.getBatteryPercentage());
        System.out.println("Carrier: " + this.getCarrier());
        System.out.println("RingTone: " + this.getRingTone());
    }
}