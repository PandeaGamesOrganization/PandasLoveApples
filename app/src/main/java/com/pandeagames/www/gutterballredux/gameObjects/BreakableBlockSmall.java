package com.pandeagames.www.gutterballredux.gameObjects;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;

import com.pandeagames.R;
import com.pandeagames.www.gutterballredux.gameControllers.Game;
import com.pandeagames.www.gutterballredux.gameObjects.debry.GrassBlockDebry;
import com.pandeagames.www.gutterballredux.gameObjects.debry.MediumGrassBlockDebry;
import com.pandeagames.www.gutterballredux.gameObjects.debry.SmallGrassBlockDebry;

import org.jbox2d.collision.shapes.PolygonShape;
import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.Body;

/**
 * Created by ccove on 12/10/2016.
 */

public class BreakableBlockSmall extends BreakableBlock {

    public BreakableBlockSmall(Game game) {
        this(game, new Vec2());
    }

    public BreakableBlockSmall(Game game, Vec2 pos){
        super(game, pos);

        this.collisionLayer = CollisionGroups.ACTOR;

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = false;
        options.inJustDecodeBounds = false;
        options.inSampleSize = 1;
        options.mCancel = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        artMainBitmap = BitmapFactory.decodeResource(game.getResources(), R.drawable.breakable_blocks_full, options);

        artMain =(BitmapDrawable) game.getResources().getDrawable(R.drawable.breakable_blocks_full);
        r = 1.5f;

        friction = 0.8f;
        shakeAmount = 0.1f;
    }
    @ Override
    public void createBody(Body body){
        PolygonShape groundBox = new PolygonShape();
        groundBox.setAsBox(1.45f,1.45f);
        body.createFixture(groundBox,0.0f);

        super.createBody(body);
    }
    protected void onBreak(){
        super.onBreak();
        GrassBlockDebry debry = new SmallGrassBlockDebry(this.game, getX(), getY());
    }
}
