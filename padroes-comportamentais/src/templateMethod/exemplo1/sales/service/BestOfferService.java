package templateMethod.exemplo1.sales.service;

import templateMethod.exemplo1.sales.model.Cart;
import templateMethod.exemplo1.sales.model.Category;
import templateMethod.exemplo1.sales.service.templates.BestOfferTemplate;
import templateMethod.exemplo1.sales.service.templates.BlackFriday;
import templateMethod.exemplo1.sales.service.templates.FreeDelivery;
import templateMethod.exemplo1.sales.service.templates.RegularPrice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BestOfferService {
	private List<BestOfferTemplate> templates;

	private void loadTemplates(Cart cart) {
		templates = new ArrayList<BestOfferTemplate>();
		templates.add(new BlackFriday(cart));
		templates.add(new RegularPrice(cart));
		templates.add(new FreeDelivery(cart));
	}


	public void calculateBestOffer(Cart cart) {
		loadTemplates(cart);
		Double bestOffer = Double.MAX_VALUE;
		for(BestOfferTemplate template: templates) {
			if(template.isAppliable()) {
				Double currentPrice = template.calculateOffer(cart);
				System.out.println(String.format("%s: %.2f", template.getClass().getSimpleName(), currentPrice));
				bestOffer = (bestOffer > currentPrice)? currentPrice: bestOffer;
			}
		}
		System.out.println(String.format("Final Price: %.2f", bestOffer));
	}
}