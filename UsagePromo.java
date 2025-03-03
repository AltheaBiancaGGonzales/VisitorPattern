// Visitor interface for data promos
public interface UsagePromo {
    String showAllowance(String telcoName, double money);
}

public interface UnliCallsTextOffer {
    String showUnliCallsTextOffer(String telcoName, boolean unliCallText);
}
