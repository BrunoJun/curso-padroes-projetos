package bridge.exemplo2.mvc.services;

import bridge.exemplo2.mvc.dao.UserDAO;
import bridge.exemplo2.mvc.model.User;

public abstract class UserServices {

    private UserDAO userDAO;
    public UserServices(UserDAO userDAO) {

        this.userDAO = userDAO;
    }

    public void save(User user){};

    public UserDAO getUserDAO() {

        return userDAO;
    }
}
