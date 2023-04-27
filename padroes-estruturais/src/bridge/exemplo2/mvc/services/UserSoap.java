package bridge.exemplo2.mvc.services;

import bridge.exemplo2.mvc.dao.UserDAO;
import bridge.exemplo2.mvc.model.User;

public class UserSoap extends UserServices {

	public UserSoap(UserDAO userDAO) {

		super(userDAO);
	}

	public void save(User user) {

		System.out.println("Starting a save operation through Soap Protocol!");
		getUserDAO().save(user);
	}
}
