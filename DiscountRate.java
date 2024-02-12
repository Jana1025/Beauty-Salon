//Karim Walid Fathy
//ID:120210220
//Section 3

public class DiscountRate {
    public static final double ServiceDiscountPremium = 0.2;
    public static final double ServiceDiscountGold = 0.15;
    public static final double ServiceDiscountSilver = 0.1;
    public static double ProductDiscount = 0.1;

    public static double getServiceDiscountRate(String membership) {
        if ("Premium".equals(membership)) {
            return ServiceDiscountPremium;
        } else if ("Gold".equals(membership)) {
            return ServiceDiscountGold;
        } else if ("Silver".equals(membership)) {
            return ServiceDiscountSilver;
        } else {
            return 0.0;
        }
    }

    public static double getProductDiscountRate(String membership) {
        return ProductDiscount;
    }
}
