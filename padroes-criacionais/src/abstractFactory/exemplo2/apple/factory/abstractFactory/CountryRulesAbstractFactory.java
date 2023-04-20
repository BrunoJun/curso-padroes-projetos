package abstractFactory.exemplo2.apple.factory.abstractFactory;

import abstractFactory.exemplo2.apple.model.certificate.Certificate;
import abstractFactory.exemplo2.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
