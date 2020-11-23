package com.company.lib.chese.player;

import com.company.lib.chese.util.Color;

/**
 * Created by bandhu on 11/22/20.
 */
public class Profile {

    private String name;
    private String id;
    private Color holdingPieceColor;


    public Profile(String name, String id, Color holdingPieceColor){
        this.name = name;
        this.id = id;
        this.holdingPieceColor = holdingPieceColor;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Color getHoldingPieceColor() {
        return holdingPieceColor;
    }
}
