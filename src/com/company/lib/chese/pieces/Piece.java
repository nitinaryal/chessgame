package com.company.lib.chese.pieces;

import com.company.lib.chese.util.Color;
import com.company.lib.chese.util.PieceName;

/**
 * Created by bandhu on 11/19/20.
 */
public interface Piece {
    boolean move(int x, int y);
    boolean canMove(int x, int y);
    PieceName getName();
    Color getColor();
    Position getPosition();
}
