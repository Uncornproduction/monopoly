package unccoder.monopoly.tile;

import hemok98.MonopolyPlayer;

public abstract class AbstractCompany implements ITile {
    protected int groupId;
    protected int buyCost;
    protected int depositCost;
    protected int buyback;

    protected String name;

    protected boolean inMonopoly;

    @Override
    public void standOn(MonopolyPlayer player) {

    }
}
/*
Пошел кушац
 */