// Observer implementation for updating iPhone models
class IphoneModelObserver implements IphoneObserver {
    @Override
    public void update(Iphone iphone) {
        System.out.println("Updated iPhone model: " + iphone.getDescription() + ", New Price: " + iphone.getCost());
    }
}
