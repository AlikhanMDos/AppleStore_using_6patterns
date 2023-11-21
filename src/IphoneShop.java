import java.util.ArrayList;
import java.util.List;
// Singleton class for managing iPhone models in the shop
class IphoneShop {
    private static IphoneShop instance;
    private List<Iphone> iphoneModels;

    private IphoneShop() {
        this.iphoneModels = new ArrayList<>();
    }

    public static IphoneShop getInstance() {
        if (instance == null) {
            instance = new IphoneShop();
        }
        return instance;
    }

    public void addIphoneModel(Iphone iphoneModel) {
        iphoneModels.add(iphoneModel);
        notifyObservers(iphoneModel);
    }

    public void deleteIphoneModel(Iphone iphoneModel) {
        iphoneModels.remove(iphoneModel);
        notifyObservers(iphoneModel);
    }

    private void notifyObservers(Iphone iphoneModel) {
        // Notify observers about changes in iPhone models
        // You can implement the observer pattern here
    }

    public List<Iphone> getIphoneModels() {
        return iphoneModels;
    }
}
