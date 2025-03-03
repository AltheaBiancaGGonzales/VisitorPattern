// TelcoSubscription interface (Visitable)
public interface TelcoSubscription {
    String accept(UsagePromo promo, double price);
    String accept(UnliCallsTextOffer unliPackage, boolean unliCallText);
}
