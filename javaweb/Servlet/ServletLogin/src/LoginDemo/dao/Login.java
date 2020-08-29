package LoginDemo.dao;

import LoginDemo.domain.User;

public interface Login {
    User loginServlet(String username, String password);
}
