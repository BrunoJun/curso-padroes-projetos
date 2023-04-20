package abstractFactory.exemplo2.apple.model.iphone;

import abstractFactory.exemplo2.apple.factory.abstractFactory.CountryRulesAbstractFactory;

public class IPhone11Pro extends IPhone {

	public IPhone11Pro(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.5in Screen");
		System.out.println("\t- A13 Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 512Gb Memory");
	}
}
