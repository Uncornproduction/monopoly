package unccoder.monopoly.tile;

public abstract class AbstractCompany implements ITile {
    protected int groupId; // Идентифекатор цвета
    protected int buyCost; // Цена покупки
    protected int depositCost; // Цена залога
    protected int buyback; // Цена выкупа

    protected String name; // Название

    protected boolean inMonopoly; // Есть монополия
}
/*
Пошел кушац
 */