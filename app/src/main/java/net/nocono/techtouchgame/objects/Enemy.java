package net.nocono.techtouchgame.objects;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Enemy {
    private float mX;
    private float mY;
    private float mRadius = 50;

    public Enemy(float x, float y) {
        this.mX = x;
        this.mY = y;
    }

    public void draw(Canvas canvas, Paint paint) {
        canvas.drawCircle(this.mX, this.mY, this.mRadius, paint);
    }

    public boolean isHit(float x, float y) {
        return (pow(x - this.mX) + pow(y - this.mY)) <= pow(this.mRadius);
    }

    private float pow(float f) {
        return f * f;
    }
}
