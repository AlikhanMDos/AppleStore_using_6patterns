// Adapter pattern implementation for charging with USB Type-C
class USBTypeCAdapter implements Iphone {
    private ChargingStrategy chargingStrategy;

    public USBTypeCAdapter(ChargingStrategy chargingStrategy) {
        this.chargingStrategy = chargingStrategy;
    }

    @Override
    public double getCost() {
        // You can implement the cost calculation logic here
        return 0.0;
    }

    @Override
    public String getDescription() {
        return "iPhone with USB Type-C Adapter";
    }

    public void chargeWithLightning() {
        chargingStrategy.charge();
    }
}
