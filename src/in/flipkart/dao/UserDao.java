package in.flipkart.dao;

import in.flikpart.session.SessionFactory;
import in.flipkart.entity.User;

public class UserDao {
	public void saveOrUpdate(User user){
		SessionFactory.getInstance().saveOrUpdate(user);
	}
}
