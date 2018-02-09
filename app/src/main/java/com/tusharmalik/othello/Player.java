package com.tusharmalik.othello;

/**
 * Created by tushm on 08-02-2018.
 */

public class Player {
    private COLOR color;

    public Player(COLOR color) {
        this.color = color;
    }

    public COLOR getColor() {
        return color;
    }

    public void setColor(COLOR color) {
        this.color = color;
    }
}
