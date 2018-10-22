package com.vv.objects18;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;

public class DrawView extends View {
    Hero hero;
    Hero hero2;
    public DrawView(Context context) {
        super(context);
        setBackgroundColor(Color.GRAY);
        Bitmap pic = BitmapFactory
                .decodeResource(getResources(),
                        R.drawable.team_lead);
        hero  = new Hero( "Jonny", pic);
        hero2 = new Hero( "Mike", pic);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        hero.go();
        hero.draw(canvas);
        hero2.go();
        hero2.draw(canvas);
        invalidate();
    }
}
