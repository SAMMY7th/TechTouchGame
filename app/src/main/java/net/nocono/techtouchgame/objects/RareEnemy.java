package net.nocono.techtouchgame.objects;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class RareEnemy extends Enemy {

    public RareEnemy(float x, float y) {
        super(x, y);
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
        paint.setColor(Color.YELLOW);
        super.draw(canvas, paint);
    }
}
