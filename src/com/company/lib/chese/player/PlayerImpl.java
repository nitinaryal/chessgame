package com.company.lib.chese.player;

import com.company.lib.chese.util.Color;

/**
 * Created by bandhu on 11/22/20.
 */
public class PlayerImpl implements Player {

    private Profile profile;

    public PlayerImpl(String name, String id, Color holdingPieceColor){
        this.profile = new Profile(name,id,holdingPieceColor);
    }

    @Override
    public Profile getPlayerProfile() {
        return null;
    }
}
