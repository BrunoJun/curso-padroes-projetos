package abstractFactory.exemplo1.app.service;

import abstractFactory.exemplo1.app.service.factory.EJBAbstractFactory;
import abstractFactory.exemplo1.app.service.factory.RestAbstractFactory;
import abstractFactory.exemplo1.app.service.factory.ServicesAbstractFactory;
import abstractFactory.exemplo1.app.service.services.CarService;
import abstractFactory.exemplo1.app.service.services.UserService;

public class Client {
	public static void main(String[] args) {

		ServicesAbstractFactory service1 = new RestAbstractFactory();
		ServicesAbstractFactory service2 = new EJBAbstractFactory();

		CarService carService = service1.getCarService();
		carService.save("HB20");
		carService.update("Model A");

		UserService userService = service2.getUserService();
		userService.save("Bruno");
		userService.delete(2);
	}
}
