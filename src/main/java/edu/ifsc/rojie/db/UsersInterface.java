package edu.ifsc.rojie.db;
import edu.ifsc.rojie.entities.User;
import javafx.collections.ObservableList;

public interface UsersInterface {
	
	public User getUser(String username);

	public ObservableList<User> getUsers();
	
	public void changePass(String username, String newPassword);
	
	public void addUser(String username, String password);

}
