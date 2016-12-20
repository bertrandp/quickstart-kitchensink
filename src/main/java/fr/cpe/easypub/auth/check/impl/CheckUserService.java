package fr.cpe.easypub.auth.check.impl;

import java.util.ArrayList;
import java.util.List;

import fr.cpe.easypub.auth.check.ICheckUserService;
import fr.cpe.easypub.model.Role;
import fr.cpe.easypub.model.User;

public class CheckUserService implements ICheckUserService {
	
	List<User> listUser = new ArrayList<User>();

	@Override
	public User getUserByLoginAndPassword(String login, String password) {
	
		if(listUser.isEmpty()){
			addUser();
		}
		
		for(User user : listUser){
			if(user.getLogin().equals(login) && user.getPassword().equals(password)){
				return user;
			}
		}
		return null;
	}

	private void addUser() {
		listUser.add(new User("admin", "admin", "Jean", "Admin", Role.ADMIN));
		listUser.add(new User("manager", "manager", "Jean", "Manager", Role.MANAGER));
		listUser.add(new User("device", "device", "Jean", "Device", Role.DEVICE));
	}

}
