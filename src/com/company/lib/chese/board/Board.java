package com.company.lib.chese.board;

import com.company.lib.chese.pieces.*;
import com.company.lib.chese.util.Color;

/**
 * Created by bandhu on 11/20/20.
 */
public class Board {

    final static byte MaxX = 8;
    final static byte MaxY = 8;

    int xMin, yMin, xMax, yMax;
    Room[][] rooms;

    public Board(){
        initBoard();
    }

    public void move(Piece piece, int toXPos, int toYPos){
        Position oldPosition = piece.getPosition();
        Room oldRoom = rooms[oldPosition.getX()][oldPosition.getY()];
        if(piece.move(toXPos,toYPos)){
            rooms[toXPos][toYPos].setPicece(piece);
            rooms[oldPosition.getX()][oldPosition.getY()].setPicece(new EmptyPiece(Color.TRANS));
        }
    }

    public Piece getPieceAtRoom(int x, int y){
        return rooms[x][y].picece;
    }

    public void displayBoardSatus(){
        for(int i=0;i<=7;i++){
            for(int j=0;j<=7; j++){
                System.out.print((rooms[i][j])+ "\t");

            }
            System.out.println();
        }
    }

    private void initBoard(){

        byte xMin =0, yMin=0, xMax=7, yMax=7;
        rooms = new Room[MaxX][MaxY];

        //Initialize firt row with one color
        int i=0,j=0;
        rooms[i][j] = new Room(new Rook(Color.BLACK), Color.WHITE, i, j);
        rooms[i][j+1] = new Room(new Knight(Color.BLACK), Color.BLACK, i, j+1);
        rooms[i][j+2] = new Room(new Bishop(Color.BLACK), Color.WHITE, i, j+2);
        rooms[i][j+3] = new Room(new King(Color.BLACK), Color.BLACK, i, j+3);
        rooms[i][j+4] = new Room(new Queen(Color.BLACK), Color.WHITE, i, j+4);
        rooms[i][j+5] = new Room(new Bishop(Color.BLACK), Color.BLACK, i, j+5);
        rooms[i][j+6] = new Room(new Knight(Color.BLACK), Color.WHITE, i, j+6);
        rooms[i][j+7] = new Room(new Rook(Color.BLACK), Color.BLACK, i, j+7);

        //last row
        i=7;j=0;
        rooms[i][j] = new Room(new Rook(Color.WHITE), Color.BLACK, i, j);
        rooms[i][j+1] = new Room(new Knight(Color.WHITE), Color.WHITE, i, j+1);
        rooms[i][j+2] = new Room(new Bishop(Color.WHITE), Color.BLACK, i, j+2);
        rooms[i][j+3] = new Room(new King(Color.WHITE), Color.WHITE, i, j+3);
        rooms[i][j+4] = new Room(new Queen(Color.WHITE), Color.BLACK, i, j+4);
        rooms[i][j+5] = new Room(new Bishop(Color.WHITE), Color.WHITE, i, j+5);
        rooms[i][j+6] = new Room(new Knight(Color.WHITE), Color.BLACK, i, j+6);
        rooms[i][j+7] = new Room(new Rook(Color.WHITE), Color.WHITE, i, j+7);

        for(i=xMin;i<=xMax;i++){
            for(j=yMin;j<=yMax; j++){

                Color initColor = Color.BLACK;

                if(i>=2 && i <=5){
                    initColor = i%2==0?Color.BLACK:Color.WHITE;
                    while(j<=7) {
                        rooms[i][j] = new Room(new EmptyPiece(Color.TRANS), initColor==Color.WHITE?Color.BLACK:Color.WHITE, i, j);
                        initColor = initColor == Color.BLACK ? Color.WHITE : Color.BLACK;
                        j++;
                    }

                }
                //Assign Pawn if it's second row or 7th row
                if(i == 1 || i == 6) {
                    initColor = i==1?Color.WHITE:Color.BLACK;
                    while(j<=7) {
                        rooms[i][j] = new Room(new Pawn(i == 1 ? Color.BLACK : Color.WHITE,i,j), initColor == Color.WHITE?Color.BLACK:Color.WHITE, i, j);
                        initColor = initColor == Color.BLACK ? Color.WHITE : Color.BLACK;
                        j++;
                    }

                }

            }
        }
    }

}
