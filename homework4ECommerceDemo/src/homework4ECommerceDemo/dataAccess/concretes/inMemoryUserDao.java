package homework4ECommerceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homework4ECommerceDemo.dataAccess.abstracts.UserDao;
import homework4ECommerceDemo.entities.concretes.User;

public class inMemoryUserDao implements UserDao {
	List<User> users = new ArrayList<User>();
	
	public inMemoryUserDao() {
		users.add(new User (1, "Ali Ýhsan", "Akçay", "alihsanakcayy@gmail.com", "123456" , true));
		users.add(new User(2, "Ömer Faruk", "Cengiz", "omerfarukcengiz@gmail.com", "654785", true));
		users.add(new User(3, "Gamze", "Gedik", "hakangedik@gmail.com", "654789", true));
	}

	@Override
	public void add(User user) {
		users.add(user);
	}

	@Override
	public void delete(User user) {
		User userToDelete = users.stream()
				  .filter(u -> u.getEmail().equals(user.getEmail()))
				  .findAny()
				  .orElse(null);
		users.remove(userToDelete);
	}

	@Override
	public void update(User user) {
		User userToUpdate = users.stream()
				  .filter(u -> u.getEmail().equals(user.getEmail()))
				  .findAny()
				  .orElse(null);
		userToUpdate.setId(user.getId());
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
		userToUpdate.setEmail(user.getEmail());
		userToUpdate.setPassword(user.getPassword());
		userToUpdate.setVerify(user.isVerify());
	}

	@Override
	public User getByEmail(String email) {
		User user = users.stream()
				  .filter(u -> u.getEmail() == email)
				  .findAny()
				  .orElse(null);
		return user;
	}
	
	@Override
	public List<User> getAll() {
		return users;
	}

}
