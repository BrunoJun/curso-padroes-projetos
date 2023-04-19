package factory_method.exemplo1.apple;

import factory_method.exemplo1.apple.factory.IPhoneFactory;
import factory_method.exemplo1.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("### Ordering an iPhone X");
		IPhone iPhone1 = IPhoneFactory.orderIphone("x", "standart");
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone2 = IPhoneFactory.orderIphone("11", "pro");
	}
}
