// Concrete decorator class for wireless charging
class WirelessCharging extends IphoneDecorator {
    public WirelessCharging(Iphone iphone) {
        super(iphone);
    }

    @Override
    public double getCost() {
        return super.getCost() + 75.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Additional Features: Wireless Charging System\n";
    }
}
