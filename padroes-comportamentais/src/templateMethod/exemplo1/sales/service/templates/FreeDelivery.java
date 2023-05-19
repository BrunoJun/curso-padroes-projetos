package templateMethod.exemplo1.sales.service.templates;

import templateMethod.exemplo1.sales.model.Cart;

public class FreeDelivery extends BestOfferTemplate{

    public FreeDelivery(Cart cart) {

        super(cart);
    }

    @Override
    public boolean isAppliable() {

        return regularItemsPrice > 500;
    }

    @Override
    protected void calibrateVariables() {

        deliveryFactor = 0.0;
    }
}
