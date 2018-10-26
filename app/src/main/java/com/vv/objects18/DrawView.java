package com.vv.objects18;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class DrawView extends View {
    Hero hero;
    Hero hero2;
    Hero[] heros = new Hero[10];
    public DrawView(Context context) {
        super(context);
        setBackgroundColor(Color.GRAY);
        Bitmap pic = BitmapFactory
                .decodeResource(getResources(),
                        R.drawable.team_lead);
        hero  = new Hero( "Jonny", pic);
        hero2 = new Hero( "Mike", pic);
        for (int i = 0; i < heros.length; i++){
            heros[i] = new Hero("Clone " + i, pic);
        }

    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        hero.go();
        hero.draw(canvas);
        hero2.go();
        hero2.draw(canvas);
        for (int i = 0; i < heros.length; i++){
            heros[i].draw(canvas);
            heros[i].go();
        }
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        Toast toast = Toast.makeText(getContext(),
                    x + " " + y, Toast.LENGTH_SHORT);
        toast.show();
        return true;
    }
}
