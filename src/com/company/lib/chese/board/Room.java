package com.company.lib.chese.board;

import com.company.lib.chese.pieces.Piece;
import com.company.lib.chese.util.Color;

/**
 * Created by bandhu on 11/20/20.
 */
public final class Room {
    Color color;
    int positionX;
    int positionY;
    Piece picece;

    public Room(Piece piece){
        this.picece = piece;
    }

    public Room(Piece picece,Color color,int positionX, int positionY){
        this.picece = picece;
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void occupyBy(Piece picece){
        this.picece = picece;
    }

    public Color getColor() {
        return color;
    }

    public int getPositionX() {
        return positionX;
    }


    public int getPositionY() {
        return positionY;
    }

    public Piece getPicece() {
        return picece;
    }

    public void setPicece(Piece picece) {
        this.picece = picece;
    }

    @Override
    public String toString() {
        return picece + " on " + color;
    }
}
