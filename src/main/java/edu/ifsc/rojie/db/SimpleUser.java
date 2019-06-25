package edu.ifsc.rojie.db;

import java.util.ArrayList;

import edu.ifsc.rojie.entities.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SimpleUser implements UsersInterface {

	private static ObservableList<User> users;


	public User getUser(String username) {
		users = getUsers();
		for (User user : users)
			if (user.getName().contentEquals(username))
				return user;
		return null;
	}


	public ObservableList<User> getUsers() {
		if (users == null) {
			users = FXCollections.observableArrayList(new ArrayList<User>());
			users.add(new User("admin", "admin"));
		}
		return users;
	}

	public void changePass(String username, String newPass) {
		User user = getUser(username);
		user.setPass(newPass);
	}


	public void addUser(String username, String pass) {
		getUsers().add(new User(username, pass));
	}
}

