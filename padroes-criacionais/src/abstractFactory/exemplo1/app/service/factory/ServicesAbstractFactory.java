package abstractFactory.exemplo1.app.service.factory;

import abstractFactory.exemplo1.app.service.services.CarService;
import abstractFactory.exemplo1.app.service.services.UserService;

public interface ServicesAbstractFactory {

    public UserService getUserService();
    public CarService getCarService();
}
