package com.company.lib.chese.pieces;

import com.company.lib.chese.util.Color;
import com.company.lib.chese.util.PieceName;
import sun.plugin.dom.exception.InvalidStateException;

/**
 * Created by bandhu on 11/20/20.
 */
public class EmptyPiece extends PieceImpl {

    final static String name = "EmptyPiece";

    public EmptyPiece(Color color){
        super(color, PieceName.Empty);
    }

    @Override
    public boolean move(int x, int y) {
        throw new InvalidStateException("Empty pieces is not allow to move");
    }

    @Override
    public boolean canMove(int x, int y) {
        throw new InvalidStateException("Empty pices can not move");
    }
}
