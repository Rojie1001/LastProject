package edu.ifsc.rojie.util;
import edu.ifsc.rojie.db.AdminUser;
import edu.ifsc.rojie.db.UsersInterface;

public class DB {
	public static UsersInterface usersAdm = (UsersInterface) new AdminUser();

}
