package frog;

import gameCommons.Game;
import gameCommons.IFrog;
import util.Case;
import util.Direction;

public class Frog implements IFrog {
	
	private Game game;
	private Case myPosition;

	@Override
	public Case getPosition(Case myPosition) {
		return this.myPosition = myPosition;
	}

	@Override
	public Case getPosition() {
		return null;
	}

	@Override
	public Direction getDirection() {
		return null;
	}

	@Override
	public void move(Direction key) {

	}
}
