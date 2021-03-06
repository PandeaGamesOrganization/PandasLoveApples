package com.pandeagames.www.gutterballredux.gameObjects.debry;

import android.graphics.Rect;

import com.pandeagames.www.gutterballredux.gameControllers.Game;

import org.jbox2d.common.Vec2;

/**
 * Created by ccove on 12/18/2016.
 */

public class MediumGrassBlockDebry extends GrassBlockDebry {
    public MediumGrassBlockDebry(Game game, float x, float y, Vec2 linearVelocity)
    {
        super(game, x, y, linearVelocity);
    }
    public MediumGrassBlockDebry(Game game, float x, float y)
    {
        super(game, x, y);
    }

    @Override
    protected int getGrassCount(){
        return 25;
    }
    @Override
    protected Rect getRect(){
        return new Rect(0, 0, 4, 4);
    }
    @Override
    protected float getGrassVelocity(){
        return 0.5f;
    }
    @Override
    protected float getGrassFriction(){
        return 0.90f;
    }
}
