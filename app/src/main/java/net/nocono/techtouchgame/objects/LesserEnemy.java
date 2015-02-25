package net.nocono.techtouchgame.objects;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class LesserEnemy extends Enemy {

    public LesserEnemy(float x, float y) {
        super(x, y);
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
        paint.setColor(Color.BLUE);
        super.draw(canvas, paint);
    }
}
