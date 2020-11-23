package com.company.lib.chese.game;

import com.company.lib.chese.board.Board;
import com.company.lib.chese.player.Player;

/**
 * Created by bandhu on 11/22/20.
 */
public class Game {
    Board chessBoard;
    Player playerOne;
    Player playerTwo;

    public Game(Board chessBoard,Player playerOne, Player playerTwo){
        this.chessBoard = chessBoard;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

}
