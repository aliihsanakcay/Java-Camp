package homework3.dataAccess.concretes;

import homework3.dataAccess.abstracts.GameDao;
import homework3.entities.concretes.Game;

public class InMemoryGameDao implements GameDao {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi " + game.getGameName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi " + game.getGameName());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi " + game.getGameName());
	}

}
