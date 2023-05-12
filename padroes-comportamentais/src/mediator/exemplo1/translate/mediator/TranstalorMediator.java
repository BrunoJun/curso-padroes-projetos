package mediator.exemplo1.translate.mediator;

import mediator.exemplo1.translate.model.User;
import mediator.exemplo1.translate.services.Translator;

public class TranstalorMediator extends Mediator{

    Translator translator = new Translator();

    @Override
    protected String getMessage(String message, User to, User from) {

        return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
    }
}
