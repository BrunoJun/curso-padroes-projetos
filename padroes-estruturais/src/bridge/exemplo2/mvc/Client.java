package bridge.exemplo2.mvc;


import bridge.exemplo2.mvc.dao.UserMysqlDao;
import bridge.exemplo2.mvc.dao.UserOracleDao;
import bridge.exemplo2.mvc.model.User;
import bridge.exemplo2.mvc.services.UserEJB;
import bridge.exemplo2.mvc.services.UserRest;
import bridge.exemplo2.mvc.services.UserServices;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");

		UserServices userServices1 = new UserRest(new UserMysqlDao());
		userServices1.save(user);

		UserServices userServices2 = new UserEJB(new UserOracleDao());
		userServices1.save(user);
	}
}
