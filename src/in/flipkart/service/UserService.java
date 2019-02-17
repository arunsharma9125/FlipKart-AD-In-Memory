package in.flipkart.service;

import in.flipkart.dao.UserDao;
import in.flipkart.entity.User;
import in.flipkart.entity.User.Gender;

public class UserService {
	private UserDao userDao = new UserDao();

	public void saveOrUpdate(User user) {
		userDao.saveOrUpdate(user);
	}
	
	public User createUser(String name, Gender gender, Integer age){
		User user = new User(name, gender, age);
		userDao.saveOrUpdate(user);
		return user;
	}
}
