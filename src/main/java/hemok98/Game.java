package hemok98;

import unccoder.monopoly.tile.AbstractCompany;
import unccoder.monopoly.tile.BaseCompanyTile;
import unccoder.monopoly.tile.ITile;
import unccoder.monopoly.tile.StartTile;

import java.util.ArrayList;

public class Game {
    private ArrayList<ITile> field;
    private ArrayList<MonopolyPlayer> players;
    private boolean isGameStart = false;

    public Game() {
        field = new ArrayList<>();

        field.add(new StartTile());

    }
}
