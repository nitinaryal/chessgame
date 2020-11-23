package com.company;

import com.company.lib.chese.board.Board;
import com.company.lib.chese.game.Game;
import com.company.lib.chese.player.Player;
import com.company.lib.chese.player.PlayerImpl;
import com.company.lib.chese.util.Color;
import com.company.lib.chese.pieces.Piece;
import com.company.lib.chese.pieces.Pawn;

public class Main {

    public static void main(String[] args) {

	// write your code here
        System.out.println("Test");
        Board board = new Board();
        Player playerOne = new PlayerImpl("FirstPlayer","1",Color.BLACK);
        Player playerTwo = new PlayerImpl("SecondPlayer","2",Color.WHITE);

        Game game = new Game(board,playerOne,playerTwo);

        Piece piece = board.getPieceAtRoom(1,0);
        board.move(piece,2,0);
        board.displayBoardSatus();
    }
}
