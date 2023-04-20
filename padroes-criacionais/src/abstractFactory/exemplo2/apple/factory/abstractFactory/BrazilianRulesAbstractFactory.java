package abstractFactory.exemplo2.apple.factory.abstractFactory;

import abstractFactory.exemplo2.apple.model.certificate.BrazilianCertificate;
import abstractFactory.exemplo2.apple.model.certificate.Certificate;
import abstractFactory.exemplo2.apple.model.packing.BrazilianPacking;
import abstractFactory.exemplo2.apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory{

    @Override
    public Certificate getCertificates() {

        return new BrazilianCertificate();
    }

    @Override
    public Packing getPacking() {

        return new BrazilianPacking();
    }
}
