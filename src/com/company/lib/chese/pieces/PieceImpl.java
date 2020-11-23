package com.company.lib.chese.pieces;

import com.company.lib.chese.util.Color;
import com.company.lib.chese.util.PieceName;

/**
 * Created by bandhu on 11/19/20.
 */
public abstract class PieceImpl implements Piece{

    Color color;
    PieceName name;
    int currentPositionX = 0;
    int currentPositionY = 0;
    boolean isLive;


    public PieceImpl(Color color,PieceName name){
        this.color = color;
        this.name = name;
    }

    public PieceImpl(Color color,PieceName name,int x, int y){
        this.color = color;
        this.name = name;
        this.currentPositionX = x;
        this.currentPositionY = y;
    }

    public PieceName getName() {
        return name;
    }

    public void setName(PieceName name) {
        this.name = name;
    }

    public int getCurrentPositionX() {
        return currentPositionX;
    }

    public void setCurrentPositionX(int currentPositionX) {
        this.currentPositionX = currentPositionX;
    }

    public int getCurrentPositionY() {
        return currentPositionY;
    }

    public void setCurrentPositionY(int currentPositionY) {
        this.currentPositionY = currentPositionY;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public Color getColor() {
        return color;
    }

    public Position getPosition(){
        return new Position(currentPositionX,currentPositionY);
    }

    @Override
    public String toString() {
        return
                "[" + color +
                " " + name + "]" ;
    }
}
