package factory_method.exemplo1.apple.factory;

import factory_method.exemplo1.apple.model.*;

public abstract class IPhoneFactory {

    // Método fabrica (Simple Factory)
	public static IPhone orderIphone(String generation, String level){

        // Declaração do objeto a ser retornado
        IPhone device = null;

        // Estruturas de decisões para criarem o objeto de acorodo com os parametros passados
        if (generation.equals("11")){

            if (level.equals("standart")){

                device = new IPhone11();
            } else if (level.equals("pro")) {

                device = new IPhone11Pro();
            }
        } else if (generation.equals("x")) {

            if (level.equals("standart")){

                device = new IPhoneX();
            } else if (level.equals("max")) {

                device = new IPhoneXSMax();
            }
        }

        if (device != null){

            device.assemble();
            device.certificates();
            device.getHardware();
            device.pack();
        }

        return device;
    }
}
