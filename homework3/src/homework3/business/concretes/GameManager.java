package homework3.business.concretes;

import homework3.business.abstracts.GameService;
import homework3.dataAccess.abstracts.GameDao;
import homework3.entities.concretes.Game;

public class GameManager implements GameService {

	private GameDao gameDao;
	
	public GameManager(GameDao gameDao) {
		this.gameDao = gameDao;
	}

	@Override
	public void add(Game game) {
		gameDao.add(game);
	}

	@Override
	public void update(Game game) {
		gameDao.update(game);
	}

	@Override
	public void delete(Game game) {
		gameDao.delete(game);
	}

}
