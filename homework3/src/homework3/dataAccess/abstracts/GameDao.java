package homework3.dataAccess.abstracts;

import homework3.entities.concretes.Game;

public interface GameDao {
	void add(Game game);
	void update(Game game);
	void delete(Game game);
}
