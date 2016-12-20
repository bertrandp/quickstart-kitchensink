package fr.cpe.easypub.auth.check;

import fr.cpe.easypub.model.User;

public interface ICheckUserService {

	User getUserByLoginAndPassword(String login, String password);

}
