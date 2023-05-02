package facade.exemplo1.callCenter.facade;

import facade.exemplo1.callCenter.model.Card;
import facade.exemplo1.callCenter.model.Register;
import facade.exemplo1.callCenter.services.*;

import java.util.List;

public class CardServiceFacade {

    CardService cardService;
    PaymentService paymentService;
    RegisterService registerService;
    ReportService reportService;
    SecurityService securityService;

    public CardServiceFacade() {

        registerService = new RegisterService();
        cardService = new CardService();
        paymentService = new PaymentService(registerService);
        reportService = new ReportService(registerService);
        securityService = new SecurityService(cardService, registerService);
    }

    public void getSumary(Card card){

        reportService.getSumary(card);
    }

    public void getPaymentInfoByCard(Card card){

        paymentService.getPaymentInfoByCard(card);
    }

    public void removeLastRegister(Card card){

        List<Register> registers = registerService.getRegistersByCard(card);
        registerService.removeByIndex(card, registers.size() - 1);
        List<Register> pendingRegisters = securityService.blockCard(card);
        Card newCard = cardService.createNewCard(123456L, 33445566L);
        registerService.addCardRegisters(newCard, pendingRegisters);
        reportService.getSumary(newCard);
    }
}
