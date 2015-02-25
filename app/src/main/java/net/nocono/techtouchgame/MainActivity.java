package net.nocono.techtouchgame;

import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CanvasView canvasView = new CanvasView(this);
        setContentView(canvasView);
    }

}
