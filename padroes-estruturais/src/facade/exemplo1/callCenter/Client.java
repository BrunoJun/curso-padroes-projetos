package facade.exemplo1.callCenter;

import facade.exemplo1.callCenter.facade.CardServiceFacade;
import facade.exemplo1.callCenter.model.Card;
import facade.exemplo1.callCenter.model.Register;
import facade.exemplo1.callCenter.services.*;

import java.util.List;


public class Client {

	public static void main(String[] args) {
		CardService cardService = new CardService();
		CardServiceFacade cardServiceFacade = new CardServiceFacade();
		
		Card card = cardService.getCardByUser(123456L);
		System.out.println(card);

		cardServiceFacade.getSumary(card);
		cardServiceFacade.getPaymentInfoByCard(card);
		cardServiceFacade.removeLastRegister(card);
	}
}
