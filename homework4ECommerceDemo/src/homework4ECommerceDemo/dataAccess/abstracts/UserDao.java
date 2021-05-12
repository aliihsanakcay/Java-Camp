package homework4ECommerceDemo.dataAccess.abstracts;

import java.util.List;

import homework4ECommerceDemo.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	User getByEmail(String email);
	List<User> getAll();
}
