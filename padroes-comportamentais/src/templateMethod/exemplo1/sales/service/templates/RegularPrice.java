package templateMethod.exemplo1.sales.service.templates;

import templateMethod.exemplo1.sales.model.Cart;

public class RegularPrice extends BestOfferTemplate{

    public RegularPrice(Cart cart) {

        super(cart);
    }

    @Override
    public boolean isAppliable() {

        return true;
    }

    @Override
    protected void calibrateVariables() {}
}
