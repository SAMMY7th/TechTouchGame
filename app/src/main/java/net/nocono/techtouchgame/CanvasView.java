package net.nocono.techtouchgame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import net.nocono.techtouchgame.objects.BossEnemy;
import net.nocono.techtouchgame.objects.LesserEnemy;
import net.nocono.techtouchgame.objects.RareEnemy;
import net.nocono.techtouchgame.objects.Enemy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CanvasView extends View {
    private List<Enemy> mEnemyList = new ArrayList<>();
    private Random mRandom = new Random();
    private Paint mPaint = new Paint();

    public CanvasView(Context context) {
        super(context);
        this.mPaint.setAntiAlias(true);
    }

    @Override
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        generateEnemy();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);

        for (Enemy enemy : mEnemyList) {
            enemy.draw(canvas, this.mPaint);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            for (int i = mEnemyList.size() - 1; i >= 0; i--) {
                if (mEnemyList.get(i).isHit(event.getX(), event.getY())) {
                    mEnemyList.remove(i);
                }
            }

            generateEnemy();
            invalidate();
        }

        return super.onTouchEvent(event);
    }

    private void generateEnemy() {
        if (mEnemyList.isEmpty()) {
            int count = mRandom.nextInt(5) + 1;

            for(int i = 0; i < count; i++) {
                switch (mRandom.nextInt(3)) {
                    case 0:
                        mEnemyList.add(new BossEnemy(mRandom.nextInt(this.getWidth()), mRandom.nextInt(this.getHeight())));
                        break;
                    case 1:
                        mEnemyList.add(new LesserEnemy(mRandom.nextInt(this.getWidth()), mRandom.nextInt(this.getHeight())));
                        break;
                    case 2:
                        mEnemyList.add(new RareEnemy(mRandom.nextInt(this.getWidth()), mRandom.nextInt(this.getHeight())));
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
