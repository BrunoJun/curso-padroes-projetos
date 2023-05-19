package templateMethod.exemplo1.sales.service.templates;

import templateMethod.exemplo1.sales.model.Cart;

import javax.xml.crypto.Data;
import java.util.Calendar;

public class BlackFriday extends BestOfferTemplate{

    public BlackFriday(Cart cart) {

        super(cart);
    }

    @Override
    public boolean isAppliable() {

        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.MONTH) == Calendar.NOVEMBER;
    }

    @Override
    protected void calibrateVariables() {

        priceFactor = 0.75;
    }
}
