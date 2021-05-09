package homework3.business.abstracts;

import homework3.entities.concretes.Game;

public interface GameService {
	void add(Game game);
	void update(Game game);
	void delete(Game game);	
}
