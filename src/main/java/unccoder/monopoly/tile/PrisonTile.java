package unccoder.monopoly.tile;

public abstract class PrisonTile implements ITile {
    protected int escapeCost; // Цена выхода
    protected int stepsBefore; // Количество ходов до принудительного выхода
}
