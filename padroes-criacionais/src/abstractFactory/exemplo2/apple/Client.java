package abstractFactory.exemplo2.apple;

import abstractFactory.exemplo2.apple.factory.IPhone11Factory;
import abstractFactory.exemplo2.apple.factory.IPhoneFactory;
import abstractFactory.exemplo2.apple.factory.IPhoneXFactory;
import abstractFactory.exemplo2.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import abstractFactory.exemplo2.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import abstractFactory.exemplo2.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {

		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		IPhoneFactory gen11Factory = new IPhone11Factory(rules);

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(rules.getCertificates().applyCertification());
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
