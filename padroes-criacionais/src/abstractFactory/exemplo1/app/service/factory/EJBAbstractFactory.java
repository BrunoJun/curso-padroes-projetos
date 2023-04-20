package abstractFactory.exemplo1.app.service.factory;

import abstractFactory.exemplo1.app.service.services.CarRestApiService;
import abstractFactory.exemplo1.app.service.services.CarService;
import abstractFactory.exemplo1.app.service.services.UserEJBService;
import abstractFactory.exemplo1.app.service.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory{

    @Override
    public UserService getUserService() {

        return new UserEJBService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestApiService();
    }
}
