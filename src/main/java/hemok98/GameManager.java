package hemok98;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private static GameManager instance;
    private ArrayList<Game> games;
    private static final int MAX_GAMES_NUMBER = 20;

    public static GameManager getInstance(){
        if (instance == null) instance = new GameManager();
        return instance;
    }

    private GameManager(){}
}
