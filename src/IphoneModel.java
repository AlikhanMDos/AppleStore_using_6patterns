// Concrete implementation of iPhone
class IphoneModel implements Iphone {
    private String modelName;
    private double baseCost;

    public IphoneModel(String modelName, double baseCost) {
        this.modelName = modelName;
        this.baseCost = baseCost;
    }

    @Override
    public double getCost() {
        return baseCost;
    }

    @Override
    public String getDescription() {
        return "Model: " + modelName;
    }
}
