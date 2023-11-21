// Simple factory implementation
class SimpleIphoneFactory implements IphoneFactory {
    @Override
    public Iphone createIphone(String modelName, double baseCost) {
        // Create a new iPhone based on user input
        return new IphoneModel(modelName, baseCost);
    }
}
