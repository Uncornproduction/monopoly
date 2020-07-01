package unccoder.monopoly.tile;

import hemok98.MonopolyPlayer;

public abstract class AbstractCompany implements ITile {
    protected int groupId; // Идентифекатор цвета
    protected int buyCost; // Цена покупки
    protected int depositCost; // Цена залога
    protected int buyback; // Цена выкупа

    protected String name; // Название

    protected boolean inMonopoly;

    @Override
    public void standOn(MonopolyPlayer player) {

    }
}

  