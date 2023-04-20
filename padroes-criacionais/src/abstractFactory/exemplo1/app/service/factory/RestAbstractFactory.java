package abstractFactory.exemplo1.app.service.factory;

import abstractFactory.exemplo1.app.service.services.CarRestApiService;
import abstractFactory.exemplo1.app.service.services.CarService;
import abstractFactory.exemplo1.app.service.services.UserRestApiService;
import abstractFactory.exemplo1.app.service.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory{

    @Override
    public UserService getUserService() {

        return new UserRestApiService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestApiService();
    }
}
