package abstractFactory.exemplo2.apple.factory.abstractFactory;

import abstractFactory.exemplo2.apple.model.certificate.Certificate;
import abstractFactory.exemplo2.apple.model.certificate.USCertificate;
import abstractFactory.exemplo2.apple.model.packing.Packing;
import abstractFactory.exemplo2.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory{
    @Override
    public Certificate getCertificates() {

        return new USCertificate();
    }

    @Override
    public Packing getPacking() {

        return new USPacking();
    }
}
