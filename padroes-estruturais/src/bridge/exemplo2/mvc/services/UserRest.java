package bridge.exemplo2.mvc.services;

import bridge.exemplo2.mvc.dao.UserDAO;
import bridge.exemplo2.mvc.model.User;

public class UserRest extends UserServices {

	public UserRest(UserDAO userDAO) {

		super(userDAO);
	}

	public void save(User user) {

		System.out.println("Starting a save operation through Rest Protocol!");
		getUserDAO().save(user);
	}
}
