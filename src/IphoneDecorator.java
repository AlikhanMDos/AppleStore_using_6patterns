// Decorator pattern implementation for additional features
class IphoneDecorator implements Iphone {
    private final Iphone decoratedIphone;

    public IphoneDecorator(Iphone iphone) {
        this.decoratedIphone = iphone;
    }

    @Override
    public double getCost() {
        return decoratedIphone.getCost();
    }

    @Override
    public String getDescription() {
        return decoratedIphone.getDescription();
    }
}
