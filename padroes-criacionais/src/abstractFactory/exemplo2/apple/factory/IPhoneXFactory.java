package abstractFactory.exemplo2.apple.factory;

import abstractFactory.exemplo2.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import abstractFactory.exemplo2.apple.model.iphone.IPhone;
import abstractFactory.exemplo2.apple.model.iphone.IPhoneXSMax;
import abstractFactory.exemplo2.apple.model.iphone.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX(rules);
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax(rules);
		} else return null;
	}

}
