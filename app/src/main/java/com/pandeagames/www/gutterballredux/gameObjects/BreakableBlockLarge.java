package com.pandeagames.www.gutterballredux.gameObjects;

import com.pandeagames.www.gutterballredux.gameControllers.Game;

import org.jbox2d.collision.shapes.PolygonShape;
import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.Body;

/**
 * Created by ccove on 12/10/2016.
 */

public class BreakableBlockLarge extends Breakable {
    public BreakableBlockLarge(Game game, Vec2 pos){
        super(game, pos);
        this.health = 3;
        this.collisionLayer = CollisionGroups.ACTOR;
    }
    @ Override
    public void createBody(Body body){
        PolygonShape groundBox = new PolygonShape();
        groundBox.setAsBox(4f,4f);
        body.createFixture(groundBox,0.0f);

        super.createBody(body);
    }
}
