package unccoder.monopoly.tile;

import java.sql.Time;

public abstract class StartTile implements ITile {
    protected int jackpotMoney; // Деньги при попадании на поле СТАРТ
    protected int casualMoney; // Деньги при проходе поля СТАРТ
    //protected Time nonPayTime; // Время, через которое деньги за круг перестабт выдавать
}
