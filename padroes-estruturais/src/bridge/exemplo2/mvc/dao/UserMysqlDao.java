package bridge.exemplo2.mvc.dao;

import bridge.exemplo2.mvc.model.User;

public class UserMysqlDao implements UserDAO{

	public void save(User user) {
		System.out.println("Saving the user in the Mysql Database!");
	}
}
