package net.nocono.techtouchgame.objects;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class BossEnemy extends Enemy {

    public BossEnemy(float x, float y) {
        super(x, y);
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
        paint.setColor(Color.RED);
        super.draw(canvas, paint);
    }
}
