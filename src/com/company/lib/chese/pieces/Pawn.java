package com.company.lib.chese.pieces;

import com.company.lib.chese.util.Color;
import com.company.lib.chese.util.PieceName;

/**
 * Created by bandhu on 11/19/20.
 */
public class Pawn extends PieceImpl {

    public Pawn(Color color){
        super(color, PieceName.Pawn);
    }

    public Pawn(Color color,int x, int y){
        super(color, PieceName.Pawn,x,y);
    }

    @Override
    public boolean move(int x, int y) {
        if(canMove(x,y)){
            currentPositionX = x;
            currentPositionY = y;
            System.out.println( name + " moved to " + x + " : " + y);
            return true;
        }
        return false;
    }

    @Override
    public boolean canMove(int x, int y) {

        if(x >=1 && x <= 6 && y >= 0 && y <= 7) {

            if (
                    (currentPositionX - 1 == x && currentPositionY == y) ||
                            (currentPositionX + 1 == x && currentPositionY == y) ||
                            (currentPositionX == x && currentPositionY - 1 == y) ||
                            (currentPositionX == x && currentPositionY + 1 == y)
                    ) {
                return true;
            }
        }
        return false;
    }
}
