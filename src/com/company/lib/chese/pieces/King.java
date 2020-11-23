package com.company.lib.chese.pieces;

import com.company.lib.chese.util.Color;
import com.company.lib.chese.util.PieceName;

/**
 * Created by bandhu on 11/20/20.
 */
public class King extends PieceImpl {

    public King(Color color){
        super(color, PieceName.King);
    }

    @Override
    public boolean move(int x, int y) {
        return canMove(x,y);
    }

    @Override
    public boolean canMove(int x, int y) {
        return false;
    }
}
