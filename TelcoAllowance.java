// Concrete Visitor for data promo allowance
public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, double money) {
        return telcoName + " offers " + money + " PHP per month.";
    }
}

public class UnliCallTextPackage implements UnliCallsTextOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return telcoName + (unliCallText ? " provides unlimited calls and texts." : " does not include unlimited calls and texts.");
    }
}
